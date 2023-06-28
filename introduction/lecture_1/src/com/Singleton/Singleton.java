package com.Singleton;

public class Singleton {
    int marks;
    private Singleton(int marks){
    this.marks=marks;
    }
    private static Singleton instance;
    public static Singleton getInstance(int marks){
        if(instance==null){
            instance=new Singleton(marks);
        }
        return instance;
    }
}
