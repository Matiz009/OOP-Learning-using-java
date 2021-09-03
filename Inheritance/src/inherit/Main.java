package inherit;
import java.util.Scanner;
public class Main   {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Choose your field");
        System.out.println("Press 1 for student");
        System.out.println("Press 2 for Worker");
        int dec = scanner.nextInt();
        if(dec==1){

            System.out.println("Enter your id");
            String id =scanner.nextLine();
            System.out.println("Enter your marks");
            double marks=scanner.nextDouble();
            Student student = new Student(name,age,id,marks);
            student.gettingOld(age);
            System.out.println(student.status(marks));


        }else if(dec==2){
            System.out.println("Enter your salary");
            double salary= scanner.nextDouble();
            worker employee= new worker(name,age,salary);
            employee.gettingOld(age);
            employee.totalSalary(salary);

        }
    }
}
