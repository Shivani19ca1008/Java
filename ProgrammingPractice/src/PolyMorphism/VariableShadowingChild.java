package PolyMorphism;import javax.security.auth.x500.X500Principal;

public class VariableShadowingChild extends VariableShadowingParent{
 int x =9;
 static int y = 5;
 public static void main(String[] args) {
	VariableShadowingParent vParent = new VariableShadowingParent();
	System.out.println(vParent.x);
	System.out.println(vParent.y);
	VariableShadowingChild vChild = new VariableShadowingChild();
	System.out.println(vChild.x);
	System.out.println(vChild.y);
	VariableShadowingParent vp = new VariableShadowingChild();
	System.out.println(vp.x);
	System.out.println(vp.y);
	
	
	
}
}
