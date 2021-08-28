import java.util.Scanner;
public class MainApp{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Student student1=new Student();//object formation
		student1.name="Alexis"; //inputing the values
		student1.registrationNumber="fa20-45";
		student1.obtainedMarks=67.34;
		if(student1.PrintStatus()==true){
			System.out.println("Congratulations! You passed the exams.");
		}else{
			System.out.println("Better Luck next time.");
		}
		System.out.print("Enter your id:");
		int id= scan.nextInt();//input id
		student1.setId(id);//checking validity
		System.out.print("Entered id is : "+student1.getId());//printing the result
	}
}