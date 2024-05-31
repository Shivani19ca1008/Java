package ola;

public class Mini extends Cab {
	int miniPrice = 10000;
	public static void main(String[] args) {
		Cab c = new Mini();			//UpCasting
		System.out.println(c.price);	
		Mini m = (Mini)c;				//downCasting
		System.out.println(m.miniPrice);
	}
}
