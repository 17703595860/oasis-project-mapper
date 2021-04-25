package com.study.plugins;

import com.study.entity.TzAppClass;
import lombok.SneakyThrows;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Context;
import tk.mybatis.mapper.generator.MapperCommentGenerator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname MapperPlugin
 * @Description
 * @Date 2021/4/25 9:35
 * @Created by helinhai
 */
public class MapperPlugin extends tk.mybatis.mapper.generator.MapperPlugin {

  @SneakyThrows
  @Override
  public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    List<IntrospectedColumn> primaryKeyColumns = introspectedTable.getPrimaryKeyColumns();
    if (primaryKeyColumns.size() > 1) {
      Class<? extends IntrospectedTable> zclass = introspectedTable.getClass();
      try {
        Class<?> superclass = zclass.getSuperclass().getSuperclass();
        Field[] declaredFields = superclass.getDeclaredFields();
        Field primaryKeyField = superclass.getDeclaredField("primaryKeyColumns");
        primaryKeyField.setAccessible(true);
        primaryKeyField.set(introspectedTable, Arrays.asList(primaryKeyColumns.get(0)));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
  }

}
