package com.example.assignment03;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public void setId(int id) {
        this.id = id;
    }

    private boolean isactive;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public int getId() {
        return id;
    }




    public Student(String name, int age, boolean isactive, int id) {
        this.name = name;
        this.age = age;
        this.isactive = isactive;
        this.id = id;
    }




}
