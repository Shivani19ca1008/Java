package Expection;

public class ClassCastExxep extends Parent{
	public static void m1() throws ClassCastException {
		Parent p = new Parent();
		ClassCastExxep c = (ClassCastExxep)p;
	}
	public static void m2() {
		try {
			m1();
		}
		catch(ClassCastException r) {
			System.out.println("class");
		}
		
	}
public static void main(String[] args) {
	m2();
	}
}
