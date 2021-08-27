public class TestApp{
	public static void main(String args[]){
		Person p1= new Person();
		p1.name="Matiz";
		p1.className="SP20-BSE-B";
		p1.age=21;
		p1.id=42;
		printData(p1);
	}
	static void printData(Person person){
		System.out.println("Name of person: "+person.name);
		System.out.println("Class of person: "+person.className);
		System.out.println("Age of person: "+person.age);
		System.out.println("ID of person: "+person.id);
	}
}