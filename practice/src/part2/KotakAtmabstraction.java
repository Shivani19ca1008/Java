package part2;

public class KotakAtmabstraction extends AtmAbstraction{
 public void deposite(){
	 System.out.println("deposite");
 }
 public void checkBal() {
	 System.out.println("check");
 }
 public void checkPin() {
	 System.out.println("pin");
 }

 public static void main(String[] args) {
	KotakAtmabstraction kc = new KotakAtmabstraction();
	kc.deposite();
	kc.checkBal();
	kc.checkPin();
	AtmAbstraction a = new KotakAtmabstraction();
	a.checkBal();
	a.deposite();
	
}
}
