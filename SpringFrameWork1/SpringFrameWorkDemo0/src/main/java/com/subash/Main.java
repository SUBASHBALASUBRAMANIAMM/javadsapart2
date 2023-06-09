package com.subash;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        doctor obj = context.getBean(doctor.class);
        obj.assist();
        obj.setQualification("mbbs");
//        System.out.println(obj);
//
//        doctor obj1 = context.getBean(doctor.class);
//        System.out.println(obj1);

    }
}