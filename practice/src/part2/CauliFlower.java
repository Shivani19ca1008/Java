package part2;

public class CauliFlower extends Vegetable{
	int price = 8;
 public static void main(String[] args) {
	Vegetable v = new CauliFlower();
//	CauliFlower c = new CauliFlower();
	CauliFlower c = (CauliFlower)v;
	System.out.println(c.price);
}
}


