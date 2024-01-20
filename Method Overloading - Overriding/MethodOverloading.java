public class MethodOverloading{
	private static int add(int a, int b){
		return (a + b);
	}
	
	private static double add(double a, double b){
		return (a + b);
	}
	
	public static void main(String args[]){
		int addResult1 = add(1, 2);
		double addResult2 = add(1.2, 1.2);
		System.out.println("Addition of numbers " + addResult1);
		System.out.println("Addition of float numbers " + addResult2);
	} 
}