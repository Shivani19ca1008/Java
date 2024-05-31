package Collection;

import java.util.LinkedList;

public class LinkedListHomo {
	public static void main(String[] args) {
		LinkedList <Integer>a = new LinkedList();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		for(Integer i : a) {
			System.out.println(i);
		}
}
}