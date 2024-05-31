package Expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void m1() throws InputMismatchException{
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
	}
	public static void m2() {
		try {
			m1();
		}
		catch(InputMismatchException r) {
			System.out.println("input type exception");
		}
	}
public static void main(String[] args) {
	m2();
}
}
