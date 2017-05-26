package com.cat.study;

import com.cat.study.domain.ExampleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/
 */
public class Entry {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.getBean(ExampleBean.class);
        context.close();
    }
}
