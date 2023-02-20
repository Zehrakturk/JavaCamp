package odev_3;

public class Gamer {
	String nationalityId;
	String firstName;
	String lastName;
	int  birthOfDay;
	
	
	
	public Gamer(String nationalityId, String firstName, String lastName, int birthOfDay) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDay = birthOfDay;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthOfDay() {
		return birthOfDay;
	}
	public int setBirthOfDay(int birthOfDay) {
		return birthOfDay;
	}
	
	
	

}
