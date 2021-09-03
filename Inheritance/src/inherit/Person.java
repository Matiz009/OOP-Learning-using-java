package inherit;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void gettingOld(int age){
     age=age+1;
    }
}
