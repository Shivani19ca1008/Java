package Polymorphism;

public class VariableShadowing1 extends VariableShadowing{
	int x=7;
	
 public static void main(String[] args) {
	
	VariableShadowing1 vs= new VariableShadowing1();
	System.out.println(vs.x);
	System.out.println(vs.x);
	VariableShadowing vs1 = new VariableShadowing1();
	System.out.println(vs1.x);
	System.out.println(vs1.x);
	
}
}
