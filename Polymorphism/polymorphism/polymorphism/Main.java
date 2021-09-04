package polymorphism;
public class Main {
    public static void main(String[] args) {
       
       CommissionEmployee comp = new CommissionEmployee("Jack","E12340",120.00);
        comp.calculateSalary(comp.getWorkingHours());
        System.out.println("Total salary: "+comp.salary);
        System.out.println("For employee with salary");
        SalaryEmployee salaryEmployee = new SalaryEmployee("Mike","M123009",67.78);
        salaryEmployee.calculateSalary(salaryEmployee.getWorkingHours());
        System.out.println("Total Salary: "+salaryEmployee.salary);
    }
}