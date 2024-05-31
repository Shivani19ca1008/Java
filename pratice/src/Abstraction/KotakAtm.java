package Abstraction;

public class KotakAtm extends Atm{
  public void deposit() {
	  System.out.println("500 is deposited");
  }
  public void checkBal() {
	  System.out.println("and bal:500");
  }
  public static void main(String[] args) {
	Atm a = new KotakAtm();
	KotakAtm k = new KotakAtm();
	a.deposit();
	k.deposit();
	k.checkBal();
}
}
