package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsCaller {
	public static void test(  ) {
		FileOutputStream f = new FileOutputStream("E://user.jpg");
	}
	public static void test2( throws FileNotFoundException) {
		try { 
			test();
		}
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}
 public static void main(String[] args ) {
	 test();
}
}
