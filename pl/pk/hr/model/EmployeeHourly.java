package pl.pk.hr.model;

public class EmployeeHourly extends Employee {
	
	private double wage;
	private int hours;

	
	/* constructor */
	public EmployeeHourly(String firstName, String lastName, String PESEL, double wage) {
		super(firstName, lastName, PESEL);
		this.wage = wage;
	}

	
	/* business methods */
	@Override
	public String getInfo() {
		String info = super.getInfo() + " (pracownik godzinowy - stawka: " + wage + ")";
		return info;
	}
	
	@Override
	public double calculateRenumeration() {
		double renumeration = wage * hours;
		return renumeration;
	}	

	
	/* getters &  setters */
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}


	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

}
