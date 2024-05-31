package Collection;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListHetro {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add("hy");
	a.add(1);
	a.add(true);
	System.out.println(a);
	
	for(Object i : a) {
		System.out.println(i);
	}
}
}
