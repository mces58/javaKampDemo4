//import java.sql.Date;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String NatioanltyId;

	public Customer(int id, String firstName, String lastName, String dateOfBirth, String natioanltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NatioanltyId = natioanltyId;
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
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNatioanltyId() {
		return NatioanltyId;
	}

	public void setNatioanltyId(String natioanltyId) {
		NatioanltyId = natioanltyId;
	}
	

}
