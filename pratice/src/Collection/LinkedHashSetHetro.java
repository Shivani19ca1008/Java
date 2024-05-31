package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetHetro {
public static void main(String[] args) {
	LinkedHashSet ls = new LinkedHashSet();
	ls.add("4");
	ls.add(5);
	ls.add('x');
	ls.add(true);
	ls.add("shivani");
	System.out.println(ls);
}
}
