package inhertanceExamples;

public class AddSum1 extends Data1{
	void sum(int n1,int n2) {
		System.out.println(n1+n2);
	}
	void sub(int n1, int n2) {
		System.out.println(n1-n2);
	}
 public static void main(String[] args) {
	AddSum a = new AddSum();
	a.sum(a.n1, a.n2);
	a.sub(a.n1,a.n2);
}
}
