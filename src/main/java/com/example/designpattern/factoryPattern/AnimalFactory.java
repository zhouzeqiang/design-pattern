package com.example.designpattern.factoryPattern;

/**
 * @author zhouzeqiang
 * @date 2019/12/13
 * @description
 */
public class AnimalFactory {

    public static Animal getAnimal(String name){
        if("cat".equalsIgnoreCase(name)){
            return new Cat();
        }
        else if("dog".equalsIgnoreCase(name)){
            return new Dog();
        }else{
            System.out.println("no such animal");
            return null;
        }
    }

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("cat");
        animal.speak();

    }

}
