import java.util.ArrayList;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo
	// object holding a reference value pointing to a student.

	public ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int empNumber) {
		return(empNumber % buckets.length);  // employee number modulo number of buckets
	}


	public void addToTable(EmployeeInfo theEmp) throws IOException{
		// Add the employee referenced by theEmp to the hash table.
		int targetBucket = calcBucket(theEmp.employeeNumber);
		boolean addStatus = buckets[targetBucket].add(theEmp);
		
	}
        
        public void addToFile(EmployeeInfo theEmp) throws IOException{
                String addEmployeeInformation = "";
                File file = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/FullTimeEmployeeData.txt");
                
                if(theEmp instanceof FTE){
                    addEmployeeInformation = theEmp.employeeNumber + "," +  theEmp.firstName + "," + theEmp.lastName + "," + theEmp.gender + "," + theEmp.workLocation + "," + theEmp.deductionRate + "," + ((FTE)theEmp).salary;

                }
                
                if(theEmp instanceof PTE){
                    addEmployeeInformation = theEmp.employeeNumber + "," +  theEmp.firstName + "," + theEmp.lastName + "," + theEmp.gender + "," + theEmp.workLocation + "," + theEmp.deductionRate + "," + ((PTE)theEmp).hourlyWage + "," + ((PTE)theEmp).hoursPerWeek + "," + ((PTE) theEmp).weeksPerYear;
                    file = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/PartTimeEmployeeData.txt");

                }
                
		if (theEmp == null) {
			return; // Nothing to do!
		}

                FileWriter fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(addEmployeeInformation);
                pw.close();
                
        }


	public EmployeeInfo removeFromTable(int empNum) throws IOException {
		// Remove that student from the hash table and return the reference value for that student.
		// Return null if that student isn't in the table.
                String checkEmployeeNumber = Integer.toString(empNum);
		int bucketToRemove = calcBucket(empNum);
                
                for (EmployeeInfo currentEmployee : buckets[bucketToRemove]) {
			if (currentEmployee.employeeNumber == empNum) {
                            if(currentEmployee instanceof FTE){
                                File oldFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/FullTimeEmployeeData.txt");
                                File newFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/TempFile");
                                FileWriter fw = new FileWriter("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/TempFile", true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                PrintWriter pw = new PrintWriter(bw);
                                Scanner scan = new Scanner(new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/FullTimeEmployeeData.txt"));
                                scan.useDelimiter("[,\n]");
                                String employeeNumber = ""; String firstName = ""; String lastName = ""; String gender = ""; String workLocation = ""; String deductionRate = ""; String salary = ""; 
                    
                                while(scan.hasNext()){
                                    employeeNumber = scan.next();
                                    firstName = scan.next();
                                    lastName = scan.next();
                                    gender = scan.next();
                                    workLocation = scan.next();
                                    deductionRate = scan.next();
                                    salary = scan.next();
                                    
                        
                                    if(!employeeNumber.equals(checkEmployeeNumber)){
                                        pw.println(employeeNumber + "," + firstName + "," + lastName + "," + gender + "," + workLocation + "," + deductionRate + "," + salary);
                                    }
                                }
                                scan.close();
                                pw.flush();
                                pw.close();
                                oldFile.delete();
                                File dump = new File("FullTimeEmployeeData.txt");
                                newFile.renameTo(dump);
                            }
                            
                            if(currentEmployee instanceof PTE){
                                File oldFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/PartTimeEmployeeData.txt");
                                File newFile = new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/TempFile");
                                FileWriter fw = new FileWriter("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/TempFile", true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                PrintWriter pw = new PrintWriter(bw);
                                Scanner scan = new Scanner(new File("/Users/MightyGoogle/NetBeansProjects/Employee_management_system/PartTimeEmployeeData.txt"));
                                scan.useDelimiter("[,\n]");
                                String employeeNumber = ""; String firstName = ""; String lastName = ""; String gender = ""; String workLocation = ""; String deductionRate = ""; String hourlyWage = ""; String hoursPerWeek = ""; String weeksPerYear = ""; 

                                while(scan.hasNext()){
                                    employeeNumber = scan.next();
                                    firstName = scan.next();
                                    lastName = scan.next();
                                    gender = scan.next();
                                    workLocation = scan.next();
                                    deductionRate = scan.next();
                                    hourlyWage = scan.next();
                                    hoursPerWeek = scan.next();
                                    weeksPerYear = scan.next();
                        
                                    if(!employeeNumber.equals(checkEmployeeNumber)){
                                        pw.println(employeeNumber + "," + firstName + "," + lastName + "," + gender + "," + workLocation + "," + deductionRate + "," + hourlyWage + "," + hoursPerWeek + "," + weeksPerYear);
                                    }
                                }
                                scan.close();
                                pw.flush();
                                pw.close();
                                oldFile.delete();
                                File dump = new File("PartTimeEmployeeData.txt");
                                newFile.renameTo(dump);
                            }
                            buckets[bucketToRemove].remove(currentEmployee);
                            return currentEmployee;
			}
		}
		return null;
                
        }
	

        public EmployeeInfo getFromTable(int empNum) {
		int theBucket = calcBucket(empNum);
		for(EmployeeInfo currentEmployee: buckets[theBucket]){
			if (currentEmployee.employeeNumber == empNum){
				return currentEmployee;
			}
		}
		return null;
	}


	public void displayTable() {
		// Walk through the buckets and display the items in each bucket's ArrayList.
		
		System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:");
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].isEmpty()) {
				System.out.println("Bucket " + i + " is empty!");
			}
			else {
				System.out.println("Bucket " + i + " contains the following:");
				for (int j = 0; j < buckets[i].size(); j++) {
					// Bucket i, item j in that bucket's ArrayList
					System.out.println("    " + buckets[i].get(j).employeeNumber + " "
							+ buckets[i].get(j).firstName + " " + buckets[i].get(j).lastName
							+ " at position " + j);
				}
			}
		}
		
	}
}
