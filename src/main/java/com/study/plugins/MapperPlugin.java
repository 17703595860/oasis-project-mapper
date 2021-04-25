package com.study.plugins;

import com.study.entity.TzAppClass;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Context;
import tk.mybatis.mapper.generator.MapperCommentGenerator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @Classname MapperPlugin
 * @Description
 * @Date 2021/4/25 9:35
 * @Created by helinhai
 */
public class MapperPlugin extends tk.mybatis.mapper.generator.MapperPlugin {
  @Override
  public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    //获取实体类
    FullyQualifiedJavaType entityType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
    //import接口
    Properties properties = super.getProperties();
    String mappers = properties.get("mappers").toString();
    List<String> mapperList = Arrays.asList(StringUtils.split(mappers, ","));
    if (introspectedTable.getPrimaryKeyColumns().size() > 1) {
      interfaze.addImportedType(new FullyQualifiedJavaType(mapperList.get(0)));
      interfaze.addSuperInterface(new FullyQualifiedJavaType(mapperList.get(0) + "<" + entityType.getShortName() + ">"));
    } else {
      for (String mapper : mapperList) {
        interfaze.addImportedType(new FullyQualifiedJavaType(mapper));
        interfaze.addSuperInterface(new FullyQualifiedJavaType(mapper + "<" + entityType.getShortName() + ">"));
      }
    }
    //import实体类
    interfaze.addImportedType(entityType);
    return true;
  }

  //  @SneakyThrows
//  @Override
//  public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//    List<IntrospectedColumn> primaryKeyColumns = introspectedTable.getPrimaryKeyColumns();
//    if (primaryKeyColumns.size() > 1) {
//      Class<? extends IntrospectedTable> zclass = introspectedTable.getClass();
//      try {
//        Class<?> superclass = zclass.getSuperclass().getSuperclass();
//        Field[] declaredFields = superclass.getDeclaredFields();
//        Field primaryKeyField = superclass.getDeclaredField("primaryKeyColumns");
//        primaryKeyField.setAccessible(true);
//        primaryKeyField.set(introspectedTable, Arrays.asList(primaryKeyColumns.get(0)));
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }
//    return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
//  }

}
