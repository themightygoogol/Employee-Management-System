
public class PTE extends EmployeeInfo {
	
	// PART TIME EMPLOYEE
	
	
	public double hourlyWage;
	public double hoursPerWeek;
	public double weeksPerYear;
	
	
	public PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double hPW, double wPY) {
		super(eN, fN, lN, g, wL, dR); // Call the EmployeeInfo constructor
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;
	}
	
	
	public double calcGrossAnnualIncome() {
		return hourlyWage * hoursPerWeek * weeksPerYear;
	}
	
	
	public double calcNetAnnualIncome() {
		return hourlyWage * hoursPerWeek * weeksPerYear * (1.0 - deductionRate);
	}


}
