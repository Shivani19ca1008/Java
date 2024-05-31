package part2;
public class encapsulation {
 private int x;
 private String y ;
encapsulation(int x,String y) {
	this.x =x;
	this.y =y;
}
 public int getNum() {
	 return x;
 }
 public String getName() {
	 return y;
 }
 public void setName() {
	 this.y = y;
 }
 
}
