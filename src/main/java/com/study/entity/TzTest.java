package com.study.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_TEST")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzTest {
    @Id
    @Column(name = "ID")
    private String id;
}