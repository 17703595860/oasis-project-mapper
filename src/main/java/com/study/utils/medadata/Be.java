package com.study.utils.medadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname Bm
 * @Description
 * @Date 2021/4/22 16:20
 * @Created by helinhai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Be implements Serializable {

  private String beId;
  private String beName;
  private Class entityClass;
  private String tableName;
  private String ClassName = "cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase";
  private FilterDfn filter;

  private List<Be> zBeList;
  private List<Prompt> promptList;
  private List<Transform> transformList;

}
