public class Student{
	String name;//For storing name of student
	String registrationNumber;//For storing registration Number of student
	double obtainedMarks;//For storing obtained Marks of student
	double TotalMarks=100.00;//For storing Total Marks of student
	double calculatePercentage(Double marks){//method to calculate Percentage of student
		double percentage=(marks*100)/TotalMarks;
		return percentage;
	}
}