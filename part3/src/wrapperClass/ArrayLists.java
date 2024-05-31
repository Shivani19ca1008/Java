package wrapperClass;

import java.util.ArrayList;

public class ArrayLists {
 public static void main(String[] args) {
	ArrayList i = new ArrayList();
	i.add("hy");
	i.add(45);
	i.add(false);
	System.out.println(i);
	for(Object a:i) {
		System.out.println(a);
	}
}
}
