package polymorphism;



public class MethodShadowingChild extends MethosShadowing{
 public static void test() {
	 System.out.println("from child");
 }
 public static void main(String[] args) {
	MethosShadowing m = new MethodShadowingChild();
	m.test();//from parent
	MethodShadowingChild c = new MethodShadowingChild();
	c.test();//from child
	MethosShadowing me = new MethosShadowing();
	me.test();//from parent
	
	
}
}
