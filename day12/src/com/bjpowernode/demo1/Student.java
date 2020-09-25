package com.bjpowernode.demo1;

/**
 * @AlanLin 2020/6/13
 */
public class Student {
    private String name;
    private char gender;
    private int age;
    private double height;
    private double weight;

    public void study(){
        System.out.println("学生"+name+"正在学习");
    }

    public Student(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Student() {
    }
}
