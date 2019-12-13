package com.example.designpattern.factoryPattern;

/**
 * @author zhouzeqiang
 * @date 2019/12/13
 * @description
 */
public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("汪~汪~");
    }
}
