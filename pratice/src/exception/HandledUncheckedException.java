package exception;

import java.io.FileOutputStream;

public class HandledUncheckedException {
public static void main(String[] args) {
	int a =16;
	int b =0;
	try {
		System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}

