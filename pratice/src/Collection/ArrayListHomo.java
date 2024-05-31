package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomo {
 public static void main(String[] args) {
	ArrayList <String>a = new ArrayList();
	a.add("hy");
	a.add("hello");
	a.add("shivanu");
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	for(String i : a) {
		System.out.println(i);
	}
}
}
