package example;

public class Employee implements payable{
    private final int numberOfWorkingHours;

    public Employee(int numberOfWorkingHours) {
        this.numberOfWorkingHours = numberOfWorkingHours;
    }



    @Override
    public int calculateSalary() {
        int totalSalary=numberOfWorkingHours*5000;
        System.out.println("Salary without stipend: "+totalSalary);
        return totalSalary;
    }
}
