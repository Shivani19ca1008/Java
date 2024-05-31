package Inheritance;

public class AddSum extends Data{
	public  void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
 public static void main(String[] args) {
	AddSum aSum = new AddSum();
	aSum.sum(aSum.x, aSum.y);
}
}
