package Collection;

import java.util.LinkedList;

public class LinkedListHetro {
public static void main(String[] args) {
	LinkedList a = new LinkedList();
	a.add("1");
	a.add(2);
	a.add(3);
	System.out.println(a);
	for(Object i : a) {
		System.out.println(i);
	}
}
}
