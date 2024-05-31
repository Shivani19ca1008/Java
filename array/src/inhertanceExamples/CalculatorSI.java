package inhertanceExamples;

public class CalculatorSI extends Customer {
void SimpleInterest(int p,int t, int r) {
		float si = (p*r*t)/100;
		System.out.println(si);
	} 
 public static void main(String[] args) {
	CalculatorSI cs = new CalculatorSI();
	cs.SimpleInterest(cs.p, cs.t, cs.r);
}
}
