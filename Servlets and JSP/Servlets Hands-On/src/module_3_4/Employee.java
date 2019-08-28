package module_3_4;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
	
	
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", fullTimeEmployee=" + fullTimeEmployee + ", department="
				+ department + ", salary=" + salary + "]";
	}
	private int EmployeeID;
	private String EmployeeName;
	private String gender;
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	private Date dateOfBirth; 
	private boolean fullTimeEmployee;
	private ArrayList<String> department;
	private double salary;
	
	Employee() {
		if(department == null)
		{
			department = new ArrayList<String>();
			department.add("Information Technology");
			department.add("Accounts");
			department.add("Maintenance");
			department.add("HR");

		}
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isFullTimeEmployee() {
		return fullTimeEmployee;
	}
	public void setFullTimeEmployee(boolean fullTimeEmployee) {
		this.fullTimeEmployee = fullTimeEmployee;
	}
	public ArrayList<String> getDepartment() {
		return department;
	}
	public void setDepartment(ArrayList<String> department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	

}
