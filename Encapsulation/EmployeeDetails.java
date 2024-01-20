class Employee{
	private int empId;
	private String empName;
	
	public void setEmployee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public String getEmployee(){
		return ("EmpId: " + this.empId + " , " +"EmpName: " + this.empName);
	}
}

public class EmployeeDetails{
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.setEmployee(1, "John");
		System.out.println(e1.getEmployee());
	}
	
}