package part2;

 class Driver implements Car{
 void start() {
	 System.out.println("car started");
 }
 void stop() {
	 System.out.println("car stoppede");
 }
 public static void main(String[] args) {
	 Driver d = new Driver();
	 d.start();
	 d.stop();
	 Car c = new Driver();
	 
 }
}
