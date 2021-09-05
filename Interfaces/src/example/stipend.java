package example;

public class stipend implements payable{
    private final int numberOfMonths;

    public stipend(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }


    @Override
    public int calculateSalary() {
        int salary=numberOfMonths*2000;
        System.out.println("Stipend amount: "+salary);
        return salary;
    }
}
