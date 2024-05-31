package inheritance;

public class Cauliflower extends Vegetable{
	double price = 30;
  public static void main(String[] args) {
	Vegetable v = new Cauliflower();
	Cauliflower c = (Cauliflower)v;
	System.out.println(c.price);
	System.out.println(c.origin);
	
}
}