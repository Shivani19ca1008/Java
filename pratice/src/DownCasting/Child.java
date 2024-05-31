package DownCasting;

import java.lang.foreign.ValueLayout.OfBoolean;

public class Child extends Parent{
	int y=8;
 public static void main(String[] args) {
	Parent p = new Child();
	Child c = (Child)p;
	
		System.out.println(c.x);
		System.out.println(c.y);
	
}
}
