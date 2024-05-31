package polymorphism;

public class MethodOverRidingChild extends MethodOverRidingParent{
 public  void test() {
	 System.out.println("from child");
 }
 public static void main(String[] args) {
	MethodOverRidingParent p = new MethodOverRidingChild();
	p.test();
	MethodOverRidingChild c = new MethodOverRidingChild();
	c.test();
	MethodOverRidingParent p1 = new MethodOverRidingParent();
	p1.test();
}
 
}
