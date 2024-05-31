package inhertanceExamples;

public class Average extends Data{
 void average(int a,int b) {
	 int avg = (a+b)/2;
	 System.out.println(avg);
 }
  public static void main(String[] args) {
	Average a = new Average();
	a.average(a.n1,a.n2);
}
}
