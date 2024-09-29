
import java.lang.Math;

public class EmployeeInfo {
	
	// Attributes
	
	public int employeeNumber;
	public String firstName;
	public String lastName;
	public String gender;
	public String workLocation;
	public double deductionRate;
	
	
	// Constructors
	
	public EmployeeInfo() {
		employeeNumber = -1;
		firstName = "a";
		lastName = "aaa";
		gender = "aaaa";
		workLocation = "aaaaa";
		deductionRate = 0;
	}
	
	public EmployeeInfo(int eN, String fN, String lN, String g, String wL, double dR) {
		
		employeeNumber = eN;
		firstName = fN;
		lastName = lN;
		gender = g;
		workLocation = wL;
		deductionRate = dR;
	}
	

	// Methods
	
	/*
	public double calcBMI() {
		double theBMI = weight / Math.pow((height/100.0), 2.0);
		return theBMI;
		return(weight / Math.pow((height/100.0), 2.0));
	}
	*/	


}
