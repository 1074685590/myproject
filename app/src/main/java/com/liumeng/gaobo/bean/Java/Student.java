package com.liumeng.gaobo.bean.Java;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

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

    @Override
    public int compareTo(Student s) {
        int num = this.getName().length() - s.getName().length();
        int num1 = num==0?this.getName().compareTo(s.getName()):num ;
        int num2 = num1==0?this.getAge()-s.getAge():num1;
        return num2;
    }
}