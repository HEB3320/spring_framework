package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigB.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        PartTimeMentor pt =container.getBean("p2",(PartTimeMentor.class));
        pt.createAccount();

        String str1 = container.getBean(String.class);
        System.out.println(str1);

        Integer abc = container.getBean(Integer.class);
        System.out.println(abc);


    }


}
