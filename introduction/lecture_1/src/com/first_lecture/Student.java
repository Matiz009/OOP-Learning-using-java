package com.first_lecture;

public class Student {
    int marks;
    String name;
    String regNumber;
    Student(int marksIn,String nameIn, String regNumberIn){
        System.out.println("Object is created..");
        this.name=nameIn;
        this.regNumber=regNumberIn;
        this.marks=marksIn;
    }

    @Override//METHOD USE TO DESTROY THE OBJECTS AUTOMATICALLY BY JAVA
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
