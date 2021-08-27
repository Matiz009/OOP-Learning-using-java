
public class MainApp{
	public static void main(String args[]){
		Student student1=new Student();//object formation
		student1.name="Alexis"; //inputing the values
		student1.registrationNumber="fa20-45";
		student1.obtainedMarks=88.67;
		double percentage=student1.calculatePercentage();//calling the method
		System.out.println("Obtained Percentage is : "+percentage);
	}
}