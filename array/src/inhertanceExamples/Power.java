package inhertanceExamples;

public class Power extends Number1{
 void sq(int n) {
	 System.out.println(n*n);
 }
 void cube(int n) {
	 System.out.println(n*n*n);
 }
 public static void main(String[] args) {
	Power p = new Power();
	p.sq(p.n);
	p.cube(p.n);
}
}
