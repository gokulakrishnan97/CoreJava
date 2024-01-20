abstract class Employee{
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public abstract float computePay();
}

class Salary extends Employee{
	int salary;
	Salary(int id, String name, int salary){
		super(id, name);
		this.salary = salary;
	}
	
	public float computePay(){
		return (this.salary / 2);
	}
}

public class EmployeeDetails{
	public static void main(String args[]){
		Salary s = new Salary(1, "John", 50000);
		System.out.println(s.computePay()); 
	}
	
}