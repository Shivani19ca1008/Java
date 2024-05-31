package part2;

public class MulDiv extends AddSum{
	public int Mul(int a,int b) {
		 return a*b;
	 }
	 public int div(int a,int b) {
		 return a/b;
	 }
	 public static void main(String[] args) {
		MulDiv mDiv = new MulDiv();
		System.out.println(mDiv.Mul(mDiv.n1,mDiv.n2));
	}
}
