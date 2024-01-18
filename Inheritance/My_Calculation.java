class Calculation{
	private int res;
	
	public void add(int num1, int num2){
		res = num1 + num2;
		System.out.println("The addition of two numbers "+ res);
	}

	public void sub(int num1, int num2){
		res = num1 - num2;
		System.out.println("The subtraction of two numbers "+ res);
	}
}

public class My_Calculation extends Calculation{
	private void multiply(int num1, int num2){
		int res = num1 * num2;
		System.out.println("The multiplication of two numbers "+ res);
	}

	private void divide(int num1, int num2){
		float res = num1/num2;
		System.out.println("The division of two numbers " + res);
	}

	public static void main(String args[]){
		My_Calculation calc = new My_Calculation();
		calc.add(10, 10);
		calc.sub(20, 10);
		calc.multiply(10, 10);
		calc.divide(100, 10);
	}
}