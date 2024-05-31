package part2;

public class AddSum extends Data{
 public  void Add(int n1,int n2) {
	 System.out.println(n1+n2); 
 }
 public void Sub(int n1,int n2) {
	 System.out.println(n1-n2);
 }
 public static void main(String[] args) {
	 AddSum a = new AddSum();
	 a.Add(a.n1, a.n2);
	 a.Sub(a.n1, a.n2);
	 
}
 
 
}
