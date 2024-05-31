
package ola;

public class Prime extends Cab{
	int primePrice = 60000;
	public static void main(String[] args) {
		Cab c = new Prime();			//UpCasting
		System.out.println(c.price);	
		Prime m = (Prime)c;				//downCasting
		System.out.println(m.primePrice);
	}
}
