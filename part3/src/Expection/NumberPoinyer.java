package Expection;

public class NumberPoinyer {
	public static void m1() throws NumberFormatException{
		String s = "hy";
		int a = Integer.parseInt(s);
	}
	public static void m2() {
		try {
			m1();
		}
		catch(NumberFormatException n) {
			System.out.println("number format exception");
		}
	}
public static void main(String[] args) {
	m2();
}

}
