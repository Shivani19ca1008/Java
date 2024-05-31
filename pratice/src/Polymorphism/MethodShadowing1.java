package Polymorphism;

public class MethodShadowing1 extends MethodShadowing{
 public static void test() {
	 System.out.println("from child");
 }
 public static void main(String[] args) {
	 MethodShadowing ms = new MethodShadowing();
	 ms.test();
	 MethodShadowing1 ms1 = new MethodShadowing1();
	 ms1.test();
	 MethodShadowing mShadowing = new MethodShadowing1();
	 mShadowing.test();
}
}
