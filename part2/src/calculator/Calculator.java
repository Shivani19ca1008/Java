package calculator;
import a.A;
import b.B;
import c.C;
import d.d;
import e.E;
public class Calculator extends E implements A,B,C,d  {
 private int res;
 public int getres() {
	 return res;
 }
 public void add(int a,int b) {
	 res = a+b;
 }
 public void add(int a,int b,int c) {
	 res = a+b+c;
 }
 public void sub(int a,int b) {
	 res = a-b;
 }
 public void mul(int a,int b) {
	 res = a*b;
 }
 public void div(int a,int b) {
	 res = a/b;
 }
 public void square(int a) {
	res = a*a;
}
 public void cube(int a) {
	 res = a*a*a;
 }
 public void power(int base,int exp) {
	 res  = (int)Math.pow(base, base);

 }
 
}
