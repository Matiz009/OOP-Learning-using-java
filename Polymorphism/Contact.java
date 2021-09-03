public class{
	private String name;
	private String email;
	private String phoneNumber;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
	public String getEmail(){
		this.email=email;
	}
	public String getName(){
		this.name=name;
	}
	
	public String getPhoneNumber(){
		this.phoneNumber=phoneNumber;
	}
	
	public Contact(String name,String email,String phoneNumber){
		setName(name);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}
	
	public Contact(String name,String email){
		setName(name);
		setEmail(email);
	}
	public Contact(String name){
		setName(name);
		
	}
	
}