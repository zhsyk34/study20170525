package com.cat.study.domain;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private long id;
    private String name;
    private int age;
    private List<String> interests;
}
