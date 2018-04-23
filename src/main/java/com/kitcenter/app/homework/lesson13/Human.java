package com.kitcenter.app.homework.lesson13;

public class Human {
    private int age;
    private String name;
    public Human(String name){
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        if (age >=1 && age<=120){
            System.out.println("New age setted");
        }
        else {
            System.out.println("Age invalid");
        }
        this.age = age ;
    }
}
