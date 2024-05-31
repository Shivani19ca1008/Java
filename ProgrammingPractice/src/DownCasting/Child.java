package DownCasting;

import java.lang.foreign.ValueLayout.OfBoolean;

public class Child extends Parent{
 int y =9;
 public static void main(String[] args) {
	 
	Parent p = new Child();
	if(p instanceof Child) {
		Child c = new Child();
		System.out.println(c.x);
		System.out.println(c.y);
	}
	
	
	
}
}
