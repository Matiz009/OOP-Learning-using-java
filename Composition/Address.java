public class Address{
	private String country;
	private String city;
	private String postalAddress;
	private String StreetAddress;
	
	public Address(String city,String country,String postalAddress,String streetAddress){
		setCity(city);
		setCountry(country);
		setPostalAddress(postalAddress);
		setStreetAddress(streetAddress);
	}
	
	public void setCountry(String country){
		this.country=country;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setPostalAddress(String postalAddress){
		this.postalAddress=postalAddress;
	}
	public void setStreetAddress(String streetAddress){
		this.StreetAddress=streetAddress;
	}
	
	public String getCountry(){
		return country;
	}
	public String getCity(){
		return city;
	}
	public String getStreetAddress(){
		return StreetAddress;
	}
	
	public String getPostalAddress(){
		return postalAddress;
	}
	
	
}