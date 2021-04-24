package com.study.utils.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/24 11:30
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Table {

    private String tableName;
    private String tableComment;

    private List<Column> columnList;

}
