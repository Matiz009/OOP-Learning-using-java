public class Person{
	private int id;
	public String name;
	public Person(int id,String name){//constructor for values instansiation
		this.name=name;
		setId(id);
	}
	public void setId(int id){
		if(id>0){
		 this.id=id;
		}
	}
	public int getId(){
		return id;
	}
}