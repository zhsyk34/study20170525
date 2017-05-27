package com.cat.study.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Shop {
    private String name;
    private Music music;
    private Film film;
}
