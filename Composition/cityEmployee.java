public class cityEmployee{
	private int id;
	private Address city;
	
	public cityEmployee(int id,Address city){
		setCity(city);
		setId(id);
	}
	public void setId(int id){
		this.id=id;
	}
	public void setCity(Address city){
		this.city=city;
	}
	public int getId(){
		return id;
	}
	public Address getCity(){
		return city;
	}
}