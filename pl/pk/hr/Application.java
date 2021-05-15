package pl.pk.hr;

import pl.pk.hr.model.Employee;
import pl.pk.hr.model.EmployeeContract;
import pl.pk.hr.model.EmployeeHourly;
import pl.pk.hr.model.EmployeeRegular;

public class Application {
	
	public static void main(String[] args) {
		EmployeeRegular e1 = new EmployeeRegular("Aniela", "Olejniczak", "68042248143", 4200.00);
		EmployeeRegular e2 = new EmployeeRegular("Marta", "Tkacz", "95031463748", 3800.00);
		
		EmployeeContract e3 = new EmployeeContract("Tomasz", "Nowak", "75101587877");
		e3.setContract("2020-02-01", "2020-08-31", 14000.00);
		
		EmployeeHourly e4 = new EmployeeHourly("Marek", "Krawiec", "98051661491", 23.40);
		e4.setHours(90);
		
		printEmployee(e1);
		printEmployee(e2);
		printEmployee(e3);
		printEmployee(e4);
	}
	
	private static void printEmployee(Employee e) {
		double renum = e.calculateRenumeration();
		String info = e.getInfo();
		System.out.println(info + " - wynagrodzenie: " + renum + " zł");
	}

}
