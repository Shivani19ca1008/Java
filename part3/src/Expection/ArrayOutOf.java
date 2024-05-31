package Expection;

import java.security.PublicKey;

public class ArrayOutOf {
public static void m1() throws ArrayIndexOutOfBoundsException{
	int a[] = {5,6,7,8};
	System.out.println(a[7]);
	
}
public static void m2() {
	try {
		m1();
	}
	catch (ArrayIndexOutOfBoundsException r) {
		System.out.println("index value not corect");// TODO: handle exception
	}
	
}
public static void main(String[] args) {
	
	System.out.println("hi");
	m2();
	System.out.println("bye");
}
}

