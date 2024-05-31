package Polymorphism;

public class MethodOverriding1 extends MethodOverriding{
	public void test() {
		System.out.println("from child");
	}
	public static void main(String[] args) {
		MethodOverriding1 ms = new MethodOverriding1();
		ms.test();
		MethodOverriding m = new MethodOverriding();
		m.test();
		MethodOverriding ms1 = new MethodOverriding1();
		ms1.test();
		
	}
}
