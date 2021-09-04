package polymorphism;
public class SalaryEmployee extends Employee{
    public SalaryEmployee(String name, String id, double workingHours) {
        super(name, id, workingHours);
    }

    @Override
    void calculateSalary(double workingHours) {
        if (workingHours>100){
            salary=workingHours*perHourSalary+1000;
        }else{
            salary=workingHours*perHourSalary;
        }
    }
}