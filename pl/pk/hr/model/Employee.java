package pl.pk.hr.model;

public abstract class Employee {
	
	protected String firstName;
	protected String lastName;
	protected String PESEL;
		
	/* constructor */
	public Employee(String firstName, String lastName, String PESEL) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.PESEL = PESEL;
	}

	
	/* business methods */
	public String getInfo() {
		String info = firstName + " " + lastName;
		return info;
	}
	
	public abstract double calculateRenumeration();
	
	
	/* getters &  setters */
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

	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}

}
