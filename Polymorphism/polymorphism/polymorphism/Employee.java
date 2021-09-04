package polymorphism;
public class Employee {
    private String name;
    private String id;
    private double workingHours;
    static int perHourSalary=4000;
    public double salary;


    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public Employee(String name, String id, double workingHours) {
        this.name = name;
        this.id = id;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    void calculateSalary(double workingHours){
         salary= workingHours*perHourSalary;
    }
}