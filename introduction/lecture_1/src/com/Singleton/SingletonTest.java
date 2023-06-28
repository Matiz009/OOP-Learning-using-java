package com.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance(100);
        if(singleton.marks==100){
            System.out.println("Well Done");
        }else{
            System.out.println("Better Luck Next Time");
        }
    }
}
