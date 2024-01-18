class Address{
	int doorNo;
	String streetName;
	String city;
	String state;
	int zipcode;
	
	Address(int doorNo, String streetName, String city, String state, int zipcode){
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getAddress(){
		return(this.doorNo + " , " + this.streetName + " , " + this.city + " , " + this.state + " , " + this.zipcode);
	}
}

class Student{
	int rollNo;
	String name;
	Address ad;

	Student(int rollNo, String name, Address ad){
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
}

public class StudentRecord{
	public static void main(String args[]){
		Address ad = new Address(4, "Peter Street", "Newyork", "US", 25641);
		Student sd = new Student(1, "John", ad);
		System.out.println("Rollno : " + sd.rollNo + " , " + " Name : " + sd.name + " , " + " Address : " + sd.ad.getAddress());
	}
}