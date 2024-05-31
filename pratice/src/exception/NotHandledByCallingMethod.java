package exception;

public class NotHandledByCallingMethod {
	public static void test() {
		String s = null;
		System.out.println(s.charAt(3));
	}
public static void main(String[] args) {

		test();
	
	
}
}
