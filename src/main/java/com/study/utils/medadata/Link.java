package com.study.utils.medadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/22 21:21
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Link {

    private String name;
    private String parentCol;
    private String ziCol;

    private Map<String, String> permission;

}
