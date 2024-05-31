package Collection;
import java.util.TreeSet;
public class TreeSetHomo {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add(3);
	t.add(4);
	t.add(5);
	for(Object i:t) {
		System.out.println(i);
	}
}
}
