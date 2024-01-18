class SuperClass{
	int num;
	SuperClass(int num){
		this.num = num;
	}
	public void display(){
		System.out.println("Display the super class");
	}
}

public class SubClass extends SuperClass{
	int num = 30;

	SubClass(){
		super(20);
	}
	
	public void display(){
		System.out.println("Display the sub class");
		System.out.println("Super class value " + super.num);
	}

	public void showItems(){
		SubClass sb = new SubClass();
		sb.display();
		super.display();
	}
	
	public static void main(String args[]){
		SubClass sb2 = new SubClass();
		sb2.showItems();
		System.out.println(sb2.num);

	}
}