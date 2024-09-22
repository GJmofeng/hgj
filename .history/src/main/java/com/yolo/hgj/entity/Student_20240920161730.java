package com.yolo.hgj.entity;

public class Student {
    private int id;
    private int age;
    private int grade;

    public Student(int id, int age, int grade) {
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public void study() {
        System.out.println("学号为" + id + "的学生正在学习");
    }

    public void examination() {
        System.out.println(grade + "年级正在考试");
    }

    public void tell() {
        System.out.print("正在讲话的是一个 " + age + "岁的学生");
    }
}
