package inhertanceExamples;

public class Calculator extends Number{
	void sum(int a,int b) {
		System.out.println("sum " + (a+b));
	}
	void sub(int a,int b) {
		System.out.println("sub " + (a-b));
	}
	void mul(int a,int b) {
		System.out.println("mul " + (a*b));
	}
	
 public static void main(String[] args) {
	Calculator c = new Calculator();
	c.sum(c.n1, c.n2);
	c.sub(c.n1,c.n2);
	c.mul(c.n1,c.n2);
}
}
