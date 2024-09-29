
public class FTE extends EmployeeInfo {
	
	// FULL TIME EMPLOYEE
	
	
	public double salary;
	
	
	public FTE(int eN, String fN, String lN, String g, String wL, double dR, double s) {
		super(eN, fN, lN, g, wL, dR); // Call the EmployeeInfo constructor
		salary = s;
	}
	
	
	public double calcGrossAnnualIncome() {
		return salary;
	}
	
	
	public double calcNetAnnualIncome() {
		return salary * (1.0 - deductionRate);
	}

}
