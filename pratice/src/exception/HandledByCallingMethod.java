package exception;

import java.security.PublicKey;

public class HandledByCallingMethod {
	public static void test() {
		System.out.println(10/0);
	}
public static void main(String[] args) {
	try {
		test();
	}
	catch(ArithmeticException a) {
		System.out.println("error");
	}
}
}
