package com.cat.study;

import com.cat.study.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/
 */
public class Entry {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
