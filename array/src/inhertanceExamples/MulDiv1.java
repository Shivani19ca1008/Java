package inhertanceExamples;

public class MulDiv1 extends Data1{
	void mul(int n1,int n2) {
		System.out.println(n1*n2);
	}
	void div(int n1, int n2) {
		System.out.println(n1/n2);
	}
 public static void main(String[] args) {
	MulDiv1 a = new MulDiv1();
	a.mul(a.n1, a.n2);
	a.div(a.n1,a.n2);
}
}
