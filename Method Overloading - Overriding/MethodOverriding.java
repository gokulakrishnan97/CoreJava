class Animal{
	public void walk(){
		System.out.println("Animal walking");
	}
}

class Dog extends Animal{
	public void walk(){
		System.out.println("Dog walking");
	}
}

public class MethodOverriding{
	public static void main(String args[]){
		Animal d1 = new Dog();
		d1.walk(); 
	}
}