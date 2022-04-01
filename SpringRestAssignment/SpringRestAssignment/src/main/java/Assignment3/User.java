package Assignment3;

public class User {
	private Integer zipcode;
	private String country;
	private String state;
	private String city;
	public User() {
		
	}
	public User(Integer zipcode, String country, String state, String city) {
		super();
		this.zipcode = zipcode;
		this.country = country;
		this.state = state;
		this.city = city;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	

}