public class Employee{
	private String name;
	private int id;
	public Address postalAddress;
	public Employee(String name,int id){
		setId(id);
		setName(name);
	}
	public Employee(String name,int id,Address postalAddress){
		setId(id);
		setName(name);
		this.postalAddress=postalAddress;
	}
	
	public void setId(int id){
		if(id>0){
			this.id=id;
		}
	}
	public void setName(String name){
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}