
public class Ex502 {
	public static double add(double a, double b) {return a + b;}
	public static double sub(double a, double b) {return a - b;}
	public static double mult(double a, double b) {return a * b;}
	public static double div(double a, double b) {return a / b;}
	public static double max(double a, double b) {
		if (a >= b) return a;
		else return b;
	}
	
	public static double min(double a, double b) {
		if (a <= b) return a;
		else return b;
	}
	
	//Factorial
	public static void factorial(int a) {
		int result = a;
		for (int i = 1; i <=a; i++) {
			result *= 1;
		}
		System.out.println(" Factorial of " + a + "!" + result );
	
	}
	
	//Circle
	public static void circ(int a) {
		String result = "Pizza circ: " + 2  * a * 3.1415792 + " inches";
		System.out.println(result);
	}
	public static void circ(double a) {
		String result = "Pizza circ: " + 2  * a * 3.1415792 + " inches";
		System.out.println(result);
	}
	public static void area(int a) {
		String result = "Pizza area: " + a  * a * 3.1415792 + " inches";
		System.out.println(result);
	}
	public static void area(double a) {
		String result = "Pizza area: " + a  * a * 3.1415792 + " inches";
		System.out.println(result);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 15;
		int b= 7;
		
		factorial(a);
		factorial(b);
		
		System.out.println("Calculator progrem:");
		System.out.println("Add: " + a+"+"+ b+ "="+ add(a,b));
		System.out.println("Subtract: " + a+ "-" + b+ "="+ sub(a,b));
		System.out.println("Multiply: " + a+ "*" + b+ "="+ mult(a,b));
		System.out.println("Divide: " + a+ "/" + b+ "="+ div(a,b));
		
		System.out.println("Max(" + a+ "," + b + "+): " + max(a,b));
		System.out.println("Min(" + a+ "," + b + "+):" + min(a,b));
		
		//Circle (pizza) 계산
		circ (b);
		area (b);
		
		circ (12); // int 매개변수
		circ(1.24567); // double 매개변수		
	
		float c = 12.345f;
		circ(c);
	
		}
	}


