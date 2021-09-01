package inherit;

public class Student extends Person{
    private String id;
    private double marks;

    public Student(String name, int age, String id, double marks) {
        super(name, age);
        this.id = id;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
    void status(double marks){
        if (marks>=50.0){
            System.out.println("pass");
        }else if(marks<50.00){
            System.out.println("fail");
        }
    }
}
