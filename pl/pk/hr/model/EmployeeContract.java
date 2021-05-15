package pl.pk.hr.model;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeContract extends Employee {
	
	private LocalDate startDate;
	private LocalDate endDate;
	private double amount;

	/* constructor */
	public EmployeeContract(String firstName, String lastName, String PESEL) {
		super(firstName, lastName, PESEL);
	}

	
	/* business methods */
	public void setContract(String startDate, String endDate, double amount) {
		this.startDate = LocalDate.parse(startDate);    // "2020-05-01"
		this.endDate = LocalDate.parse(endDate);
		this.amount = amount;
	}
	
	@Override
	public String getInfo() {
		String info = super.getInfo() + " (pracownik kontraktowy - okres: " + startDate + " - " + endDate + ")";
		return info;
	}
	
	@Override
	public double calculateRenumeration() {
		int months = Period.between(startDate, endDate.plusDays(1)).getMonths();
		double renumeration = amount / months;
		return renumeration;
	}
	
	
	/* getters &  setters */
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
