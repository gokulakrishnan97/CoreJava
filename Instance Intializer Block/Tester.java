class SuperClass{
	SuperClass(){
		System.out.println("Super class");
	}
}

class SubClass extends SuperClass{
	int a;
	{
		System.out.println("Inside initializer block");
		a = 10;
	}
	SubClass(){
		System.out.println("Sub class");
		a = 20;
	}
}

public class Tester{
	public static void main(String args[]){
		SubClass s = new SubClass();
		System.out.println("The value of a is " + s.a);
	}
}