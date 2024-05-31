package inhertanceExamples;

public class Rectangle extends Measurement{
  void area(double l,double w) {
	  System.out.println("Area =" +(l*w));
  }
  void peri(double l,double b) {
	  System.out.println("perimeter ="+(2*(l*b)));
  }
  public static void main(String[] args) {
	  Rectangle r = new Rectangle();
	  r.area(r.l, r.w);
	  r.peri(r.l, r.w);
  }
}
