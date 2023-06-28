package com.second_lecture;

public class Main {
    static int a=5;
    static int b;
    static {//static only runs once when the first object is created and class is loaded for the first time
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {//main is static because main method is called first, and we want to use it without creating objects

        System.out.println("Hello and welcome!");
        Student mati = new Student(400, "Mati ul Rehman","SP20-BSE-042");
        Student ali = new Student(500, "Ali","SP20-BSE-002");
        System.out.println(mati.name+": "+mati.marks);
        Student std;
//        for (int i = 0; i < 10000000; i++) {
//            std=new Student(400,"Random Name","SP20-BSE-00");
//        }
        System.out.println(Student.strength);
        printSomething();
       Main main = new Main();
        System.out.println(a);
        System.out.println(b);


    }
    public static void printSomething(){//we are making it static because a non-static method can not be called in a static method as main is static
        System.out.println("Hello I am in second lecture");
    }
}