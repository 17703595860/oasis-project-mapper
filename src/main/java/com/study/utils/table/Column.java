package com.study.utils.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/24 11:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Column {

    private String colName;
    private String colType;
    private String canNull;
    private String colKey;  // 主键外键列 主键PRI 外键 UK
    private String defaultVal;
    private String colComment;
    private String colCommentDesc;

}
