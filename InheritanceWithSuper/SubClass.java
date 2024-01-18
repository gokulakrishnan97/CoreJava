class SuperClass{
	int num = 20;
	public void display(){
		System.out.println("Display the super class");
	}
}

public class SubClass extends SuperClass{
	int num = 30;
	
	public void display(){
		System.out.println("Display the sub class");
	}

	public void showItems(){
		SubClass sb = new SubClass();
		sb.display();
		super.display();
	}
	
	public static void main(String args[]){
		SubClass sb2 = new SubClass();
		sb2.showItems();
	}
}