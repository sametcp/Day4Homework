
public class Gamer {
	
	private int id;
	private String firstName;
	private String LastName;
	private int yearOfBirth;
	private String nationalityId;
	
	
	
	public Gamer() {
		
		
		
	}
	
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.LastName = lastName;
		this.yearOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
