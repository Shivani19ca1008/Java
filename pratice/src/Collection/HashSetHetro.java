package Collection;

import java.util.HashSet;

public class HashSetHetro {
 public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add("3");
	h.add(4);
	h.add(0.5);
	h.add('c');
	System.out.println(h);
	for(Object i:h) {
		System.out.println(i);
	}
}
}
