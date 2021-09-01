package inherit;

public class worker extends Person{
    private double salary;

    public worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
    public void totalSalary(double increase){
        salary=salary+increase;
        setSalary(salary);
        System.out.println("Your new salary: "+getSalary());
    }
}
