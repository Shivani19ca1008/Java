
package string;
import java.util.Scanner;
public class StringIntoChar {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String s1 = s.nextLine();
	char [] a = s1.toCharArray();
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
