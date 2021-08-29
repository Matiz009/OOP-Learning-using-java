import java.util.Scanner;
public class TestApp{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Person p1= new Person();
		System.out.printf("Enter your name:\t");
		p1.name=scan.nextLine();
		System.out.printf("\nEnter your class name:\t");
		p1.className=scan.nextLine();
		System.out.printf("\nEnter your age:\t");
		p1.age=scan.nextInt();
		System.out.printf("\nEnter your id:\t");
		p1.id=scan.nextInt();
		printData(p1);
	}
	static void printData(Person person){
		System.out.println("Name of person: "+person.name);
		System.out.println("Class of person: "+person.className);
		System.out.println("Age of person: "+person.age);
		System.out.println("ID of person: "+person.id);
	}
}