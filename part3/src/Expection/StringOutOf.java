package Expection;

public class StringOutOf {
	public static void m1() throws StringIndexOutOfBoundsException {
		String s = "hello";
		System.out.println(s.charAt(7));
		
	}
	public static void m2() {
		try {
			m1();
		}
		catch (ArrayIndexOutOfBoundsException r) {
			System.out.println("out of bound exception");
	}
		finally {
			System.out.println("hi");
		}
	}
public static void main(String[] args) {
	m2();
	}
	
}


