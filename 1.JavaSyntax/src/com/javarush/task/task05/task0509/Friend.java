package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    int age;
    char sex;
    String name;

    public void initialize (String name){
       this.name = name;
    }
    public void initialize (String name, int age ){
        this.name = name;
        this.age = age;
    }
    public void initialize (String name, int age, char sex){
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
