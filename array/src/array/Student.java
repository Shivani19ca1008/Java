package array;

public class Student {
 public static void main(String[] args) {
	 
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student s4 = new Student();
	Student s5 = new Student();
	
	Student [] s = new Student[5];
	s[0] = s3;
	s[1] = s1;
	s[2] = s2;
	s[3] = s5;
	//s[4] = s4;
	
	for (Student i : s) {
		System.out.print(i+" ");
	}
 }
}
