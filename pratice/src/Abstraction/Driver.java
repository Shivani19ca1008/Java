package Abstraction;

public class Driver implements Car{
 public void start(){
	 System.out.println("car has been started");
 }
 public void stop(){
	 System.out.println("stopped");
	 
 }
 public static void main(String[] args) {
	Driver d = new Driver();
	d.start();
	d.stop();
}
}
