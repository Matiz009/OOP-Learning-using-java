package abstractDemo;

public abstract class Student {
    private int age;
    private String name;
    private int marks;
    abstract void calculateMarks(int age,String name,int marks);
    abstract void calculateGrade(int age,String name,int marks);

}
