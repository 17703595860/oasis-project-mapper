package com.study.教育基线.class_room;//package com.study.AA_utils;

import com.study.entity.TzLicense;
import com.study.entity.TzLicensePermissionRel;
import com.study.entity.TzPermission;
import com.study.entity.TzPermissionGroup;
import com.study.mapper.TzLicenseMapper;
import com.study.mapper.TzLicensePermissionRelMapper;
import com.study.mapper.TzPermissionGroupMapper;
import com.study.mapper.TzPermissionMapper;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Classname Lincense
 * @Description
 * @Date 2021/5/11 10:32
 * @Created by helinhai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Lincense {

  @Autowired
  private DataSourceTransactionManager transactionManager;
  @Autowired
  private TzPermissionGroupMapper tzPermissionGroupMapper;
  @Autowired
  private TzPermissionMapper tzPermissionMapper;
  @Autowired
  private TzLicenseMapper tzLicenseMapper;
  @Autowired
  private TzLicensePermissionRelMapper tzLicensePermissionRelMapper;

  String admin = "ADMIN0000000000001";
  Date date = new Date();
  Integer idNum = 18;

  private String licenseIdpre = "roomLN";
  private String licensePermissionIdpre = "roomLNPM";

  private Integer licenseIdA = 1;
  private Integer licensePermissionIdA = 1;

  private List<String> licenseIdInsertList = new ArrayList<>();
  private List<String> licensePermissionIdInsertList = new ArrayList<>();

  // 是否自定义路径
  private String module = "room";
  private boolean fileFlag = false;
  private String descFilePath = "D:/桌面/sql/";
  private boolean transactionCommit = false;

  private String permissionGroupId = "roomPMGroup0000001";

  @Test
  public void test() {
    DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
    def.setName("copyFieldToDisplayFrame");
    TransactionStatus status = transactionManager.getTransaction(def);
    try {
      // 查询权限
      TzPermissionGroup tzPermissionGroup = tzPermissionGroupMapper.selectByPrimaryKey(permissionGroupId);
      if (tzPermissionGroup == null) {
        throw new Exception("权限组查询错误");
      }
      Example example = new Example(TzPermission.class);
      Example.Criteria criteria = example.createCriteria();
      criteria.andEqualTo("groupId", permissionGroupId);
      example.orderBy("id").asc();

      List<TzPermission> permissionList = tzPermissionMapper.selectByExample(example);
      if (CollectionUtils.isEmpty(permissionList)) {
        throw new Exception("权限为空");
      }

      // 添加许可证
      TzLicense tzLicense = new TzLicense(nextLicenseId(), module, module + "-License", 1, admin, date, admin, date);
      tzLicenseMapper.insertSelective(tzLicense);
      // 添加许可证权限中间表
      for (TzPermission tzPermission : permissionList) {
        String permissionId = tzPermission.getId();
        TzLicensePermissionRel licensePermissionRel = new TzLicensePermissionRel(nextLicensePermissionId(), tzLicense.getId(), permissionId, 1, admin, date, admin, date);
        tzLicensePermissionRelMapper.insertSelective(licensePermissionRel);
      }
      // 写文件
      createFile();


      if (transactionCommit) {
        transactionManager.commit(status);
      } else {
        transactionManager.rollback(status);
      }
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
  }

  private void createFile() {
    String srcFilePath = null;
    if (fileFlag) {
      srcFilePath = descFilePath;
    }else {
      srcFilePath = "src/test/java/com/study/AA_sql/" + module + "/";
      new File(srcFilePath).mkdirs();
    }
    String filePath = srcFilePath + "08-OTHER.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }

    if (CollectionUtils.isEmpty(licenseIdInsertList)) {
      return;
    }

    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      String licenseId = licenseIdInsertList.get(0);

      bw.write("DELETE FROM TZ_LICENSE_PERMISSION_REL WHERE LICENSE_ID = '" + licenseId + "';");
      bw.newLine();
      bw.write("DELETE FROM TZ_LICENSE WHERE ID = '" + licenseId + "';");
      bw.newLine();bw.newLine();

      // 添加license
      List<TzLicense> tzLicenses = tzLicenseMapper.selectByIds("'" + licenseId + "'");
      List<Map<String, List<String>>> objList = tzLicenses.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_LICENSE", bw);
      // 添加frameElement
      List<TzLicensePermissionRel> licensePermissionRels = tzLicensePermissionRelMapper.selectByIds(StringUtils.join(licensePermissionIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = licensePermissionRels.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_LICENSE_PERMISSION_REL", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @SneakyThrows
  private Map<String, List<String>> getColAndVal(Object obj) {
    ArrayList<String> colList = new ArrayList<>();
    ArrayList<String> valList = new ArrayList<>();
    Class<?> zClass = obj.getClass();
    Field[] fields = zClass.getDeclaredFields();
    for (Field field : fields) {
      field.setAccessible(true);
      String name = field.getName();
      if (StringUtils.equalsAny(name, "createdBy", "created", "lastUpdBy", "lastUpd")) {
        continue;
      }
      String colName = field.getAnnotation(Column.class).name();
      String valStr = null;
      Object valObj = field.get(obj);
      if (valObj == null) {
        valStr = "null";
      } else {
        valStr = valObj.toString();
        if (Date.class.isAssignableFrom(field.getType())) {
          throw new RuntimeException("有日期时间类型");
        }
        if (String.class.isAssignableFrom(field.getType())) {
          valStr = "'" + valStr + "'";
        }
      }
      colList.add("`" + colName + "`");
      valList.add(valStr);
    }
    Map<String, List<String>> result = new HashMap<String, List<String>>() {{
      put("col", colList);
      put("val", valList);
    }};
    return result;
  }


  @SneakyThrows
  private void createSql(List<Map<String, List<String>>> objList, String tableName, BufferedWriter bw) {
    if (CollectionUtils.isEmpty(objList)) {
      return;
    }
    bw.write("INSERT INTO `" + tableName + "`(" + StringUtils.join(objList.get(0).get("col"), ", ") + ") VALUES");
    bw.newLine();
    for (int i = 0; i < objList.size(); i++) {
      if (i == objList.size() - 1) {
        bw.write("  (" + StringUtils.join(objList.get(i).get("val"), ", ") + ")");
      } else {
        bw.write("  (" + StringUtils.join(objList.get(i).get("val"), ", ") + "),");
      }
      bw.newLine();
    }
    bw.write(";");
    bw.newLine();bw.newLine();
  }

  private String nextLicenseId() {
    String frameId = licenseIdpre + String.format("%0" + (idNum - licenseIdpre.length()) + "d", licenseIdA++);
    licenseIdInsertList.add(frameId);
    return frameId;
  }
  private String nextLicensePermissionId() {
    String frameId = licensePermissionIdpre + String.format("%0" + (idNum - licensePermissionIdpre.length()) + "d", licensePermissionIdA++);
    licensePermissionIdInsertList.add(frameId);
    return frameId;
  }
}
