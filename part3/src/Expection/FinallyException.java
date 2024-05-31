package Expection;

public class FinallyException {
public static void main(String[] args) {
	test();
}
static void test() {
	try {
		int a = 10/5
				;
	}
	catch(ArithmeticException e) {
		System.out.println("problem is there");
	}
	finally {
		System.out.println("thank");
	}
}
}
