package Expection;

public class NullPoint {
	public static void m1() throws NullPointerException{
		String s = null;
		System.out.println(s.length());
	}
	public static void m2() {
		try {
			m1();
		}
		catch(NullPointerException n) {
			System.out.println("null pointer");
		}
	}
public static void main(String[] args) {
	m2();
}
}
