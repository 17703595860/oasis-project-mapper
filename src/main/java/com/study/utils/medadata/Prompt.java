package com.study.utils.medadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname Prompt
 * @Description
 * @Date 2021/4/23 10:26
 * @Created by helinhai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Prompt {

  private String promptId;
  private String promptName;
  private String colName;
  private Be be;
  private String labelColName;
  private String valueColName;

  private List<String> promptFldCollist;

}
