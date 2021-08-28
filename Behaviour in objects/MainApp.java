import java.util.Scanner;
public class MainApp{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Student student1=new Student();//object formation
		student1.name="Alexis"; //inputing the values
		student1.registrationNumber="fa20-45";
		System.out.print("Enter your marks:");
		student1.obtainedMarks=scan.nextDouble();
		double getMarks=student1.obtainedMarks;
		double percentage=student1.calculatePercentage(getMarks);//calling the method
		System.out.println("Obtained Percentage is : "+percentage);
	}
}