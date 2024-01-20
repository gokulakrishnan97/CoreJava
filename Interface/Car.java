interface Vehicle{
	void engineType();
	void mileage();
	void color();
	void modalType();
}

class Honda implements Vehicle {
	public void engineType(){
		System.out.println("The engine type of this car is petrol");
	}
	
	public void mileage(){
		System.out.println("Gives 25km");
	}
	
	public void color(){
		System.out.println("Blue");
	}
	
	public void modalType(){
		System.out.println("Mid-range modal");
	}
}

public class Car{
	public static void main(String args[]){
		Honda h1 = new Honda();
		h1.engineType();
		h1.mileage();
	}
}