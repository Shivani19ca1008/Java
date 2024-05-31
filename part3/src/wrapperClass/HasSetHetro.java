package wrapperClass;
import java.util.HashSet;
public class HasSetHetro {
 public static void main(String[] args) {
	HashSet hSet = new HashSet();
	hSet.add("a");
	hSet.add(5.6);
	System.out.println(hSet);
}
}
