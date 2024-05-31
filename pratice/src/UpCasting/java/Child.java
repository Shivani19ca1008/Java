package UpCasting.java;

public class Child extends Parent{
  int y=7;
  public static void main(String[] args) {
	Parent parent = new Child();
	System.out.println(parent.x);
}
}
