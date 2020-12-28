package com.example.demo.bean;

import com.example.demo.entity.A;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        A a = new A();
        return a;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
