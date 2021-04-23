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
public class Transform {

  private String colName;
  private String transformCode;

}
