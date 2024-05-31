package classCastExcetion;

public class Child extends Parent{
 int y=7;
 public static void main(String[] args) {
	Parent p = new Parent();
	Child child = (Child)p;
	if(p instanceof Child) {
		System.out.println(child.x);
		System.out.println(child.y);
		
	}
}
}
