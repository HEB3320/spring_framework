package com.cydeo.bean_annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class CydeoApp {

    public static void main(String[] args) {


        ApplicationContext container =  new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class) ;

     FullTimeMentor fm=container.getBean(FullTimeMentor.class);
        fm.createAccount();


        PartTimeMentor pt=container.getBean("p1",PartTimeMentor.class);
        pt.createAccount();//part time mentor


       String  str1= container.getBean(String.class);
        System.out.println(str1);


        Integer  int1= container.getBean(Integer.class);
        System.out.println(int1);
    }
}
