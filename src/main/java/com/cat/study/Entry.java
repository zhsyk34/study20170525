package com.cat.study;

import com.cat.study.config.BeanConfig;
import com.cat.study.config.Shop;
import com.cat.study.domain.Student;
import com.cat.study.domain.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/
 */
public class Entry {

    public static void main(String[] args) {
        xml();
    }

    private static void ano() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(context.getBean(Shop.class));
        context.close();
    }

    private static void xml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(teacher);

        System.out.println(context.getBean(Student.class));
        context.close();
    }
}
