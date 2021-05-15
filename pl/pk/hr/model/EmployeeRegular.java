package pl.pk.hr.model;

public class EmployeeRegular extends Employee {
	
	private double salary;

	/* constructor */
	public EmployeeRegular(String firstName, String lastName, String PESEL, double salary) {
		super(firstName, lastName, PESEL);
		this.salary = salary;
	}

	
	/* business methods */
	@Override
	public double calculateRenumeration() {
		return salary;
	}
	
	@Override
	public String getInfo() {
		String info = super.getInfo() + " (pracownik etatowy)";
		return info;
	}

	
	/* getters &  setters */
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
