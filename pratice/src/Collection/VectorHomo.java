package Collection;

import java.util.Vector;

public class VectorHomo {

	public static void main(String[] args) {
		Vector<String> ch= new Vector();
		ch.add("C");
		ch.add("A");
		ch.add("a");
		ch.add("%");
		ch.add("@");
		ch.add(" ");
		System.out.println(ch);
		for (String s : ch) {
			System.out.println(s);
		}
	}
}
