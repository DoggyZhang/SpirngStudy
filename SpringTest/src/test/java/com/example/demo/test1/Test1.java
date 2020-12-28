package com.example.demo.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(Test1.class.getResource("test1.xml").getPath());
    }

}
