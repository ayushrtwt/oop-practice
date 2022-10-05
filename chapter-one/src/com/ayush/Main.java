package com.ayush;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this (0,null,0);
    }

    Student(int rno,String name, float marks){
        this.rno = 9;
        this.name = "Ayush";
        this.marks = 90.0f;
    }

}
