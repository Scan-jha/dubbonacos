package com.dubbo.entiy;

import java.io.Serializable;

/**
 * @program: springbootdubbonocas
 * @description: 实体类
 * @author: JH
 * @create: 2021-03-04 17:26
 */
public class Persion implements Serializable {

    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}