package com.study.utils.medadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname FilterDfn
 * @Description
 * @Date 2021/4/23 9:35
 * @Created by helinhai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilterDfn {

  private String filterId;
  private String filterName;

  private List<String> filterFldList;

}
