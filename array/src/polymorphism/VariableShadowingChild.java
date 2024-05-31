package polymorphism;

public class VariableShadowingChild extends VariableShadowingParent{
  int x =10;
  static int y=13;
  public static void main(String[] args) {
	VariableShadowingParent p = new VariableShadowingChild();
	System.out.println(p.x);
	System.out.println(p.y);
	VariableShadowingChild c = new VariableShadowingChild();
	System.out.println(c.x);
	System.out.println(c.y);
	VariableShadowingParent p1 = new VariableShadowingParent();
	System.out.println(p1.x);
	System.out.println(p1.y);
	
}
}
