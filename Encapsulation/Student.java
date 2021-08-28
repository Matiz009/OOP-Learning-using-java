public class Student{
	String name;//For storing name of student
	String registrationNumber;//For storing registration Number of student
	double obtainedMarks;//For storing obtained Marks of student
	double TotalMarks=100.00;//For storing Total Marks of student
	private int id;
	public void setId(int num){//set method for id
		if(num>0)
			id=num;
		else
		System.out.println("Invalid id");
	}
	public int getId(){//get method for id
		return id;
	}
	private double calculatePercentage(){//method to calculate Percentage of student
		double percentage=(obtainedMarks*100)/TotalMarks;   //This method is private  and only accessed through methods of the same class
		return percentage;
	}
	public boolean PrintStatus(){
		if(calculatePercentage() > 50.00){
			return true;
		}
		return false;
	}
}