package com.example.designpattern.factory;

/**
 * @author zhouzeqiang
 * @date 2019/12/13
 * @description
 */
public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("喵~喵~");
    }
}
