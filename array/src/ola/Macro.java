package ola;

public class Macro extends Cab {
	int macroPrice = 40000;
	public static void main(String[] args) {
		Cab c = new Macro();			//UpCasting
		System.out.println(c.price);	
		Macro m = (Macro)c;				//downCasting
		System.out.println(m.macroPrice);
	}
}
