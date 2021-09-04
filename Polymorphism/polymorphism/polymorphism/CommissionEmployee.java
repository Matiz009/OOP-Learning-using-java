package polymorphism;
public class CommissionEmployee extends Employee {
   private double commission;

    public CommissionEmployee(String name, String id, double workingHours) {
        super(name, id, workingHours);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    void calculateSalary(double workingHours) {
        if(workingHours>10){
            setCommission(10000);
            salary=workingHours*perHourSalary+getCommission();

        }else if (workingHours<0){
            setCommission(0.0);
            salary=workingHours*perHourSalary+getCommission();
        }
    }
}