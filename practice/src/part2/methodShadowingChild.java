package part2;

public class methodShadowingChild extends methodShadowingParent{
	public static void test() {
		 System.out.println("from child");
	 }
 public static void main(String[] args) {
	methodShadowingParent mParent = new methodShadowingParent();
	mParent.test();
	methodShadowingParent mp = new methodShadowingParent();
	mp.test();
	methodShadowingChild mChild = new methodShadowingChild();
	mChild.test();
} 
}
