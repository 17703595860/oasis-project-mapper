package com.study.utils.medadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname Bm
 * @Description
 * @Date 2021/4/22 16:20
 * @Created by helinhai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bm implements Serializable {

  private String bmId;
  private String bmName;

}
