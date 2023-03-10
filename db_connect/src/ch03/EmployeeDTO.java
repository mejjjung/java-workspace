package ch03;

public class EmployeeDTO {

	int empNo;
	String birthData;
	String firstName;
	String lastName;
	String gender;
	String hireDate;
	
	
	public EmployeeDTO(int empNo, String birthData, String firstName, String lastName, String gender, String hireDate) {
		super();
		this.empNo = empNo;
		this.birthData = birthData;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}


	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", birthData=" + birthData + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}
	
	
	
	
}
