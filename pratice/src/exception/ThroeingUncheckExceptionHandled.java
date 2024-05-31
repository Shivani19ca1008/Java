package exception;

public class ThroeingUncheckExceptionHandled {
public static void main(String[] args) {
	int a =15;
	int b =10;
	if(a>b) {
		try {
			throw new ArithmeticException("manually");
		}
		catch(ArithmeticException e) {
			System.out.println("handeld");
		}
	}
		else {
			System.out.println("no exception");
		}
	}
}

