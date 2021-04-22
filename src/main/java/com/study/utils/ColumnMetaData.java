package com.study.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname ColumnMetaData
 * @Description
 * @Date 2021/4/22 15:51
 * @Created by helinhai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ColumnMetaData implements Serializable {

  private String colName;
  private String colType;
  private Integer textLen;
  private Integer numberLen;
  private Integer scaleLen;
  private String colComment;
  private String required;

}
