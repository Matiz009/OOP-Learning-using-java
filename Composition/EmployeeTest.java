public class EmployeeTest{
	public static void main(String args[]){
		Address address= new Address("Pattoki","Pakistan","55300","G-S PHASE 1");
		Employee employee1= new Employee("Matiz",42,address);
		cityEmployee cmp= new cityEmployee(23,address);//we have to parse the address of type Address to get access of all the required values of address class
		System.out.println(employee1.postalAddress.getCity());
		System.out.println(cmp.getCity().getCountry());
		
	}
}