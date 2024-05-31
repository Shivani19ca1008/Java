package Expection;

public class ArithMeticException {
	public static void m1() throws ArithmeticException{
		int a =5;
		int b=0;
		int div = a/b;
		System.out.println(a/b);
		
	}
	public static void m2() {	
		try {	
			m1();
		} catch (ArithmeticException r) {
			System.out.println("arithmetic");
		}
	}
 public static void main(String[] args) {
	m2();
}
}
