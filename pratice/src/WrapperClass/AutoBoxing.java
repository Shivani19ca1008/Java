package WrapperClass;

public class AutoBoxing {
 public static void main(String[] args) {
	Byte b = new Byte("10");
	System.out.println(b);
	int i =10;
	Integer integer = new Integer(i);
	System.out.println(integer);
	int x = integer;
	System.out.println(x);
}
}
