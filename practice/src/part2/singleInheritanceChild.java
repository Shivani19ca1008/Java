package part2;

public class singleInheritanceChild extends SingleInheritance{
	int y =6;
  public static void main(String[] args) {
	singleInheritanceChild sChild = new singleInheritanceChild();
	System.out.println(sChild.x);
	SingleInheritance spInheritance = new SingleInheritance();
	System.out.println(sChild.y);
	System.out.println(spInheritance.x);
//	System.out.println(spInheritance.y);

}
}
