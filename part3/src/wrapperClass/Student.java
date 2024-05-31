package wrapperClass;

public class Student {
	int roll;
	String name;
	Student(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	public String toString() {
		return name +" "+roll;
	}
 public static void main(String[] args) {
	Student s = new Student("dev", 3);
	System.out.println(s);
}
}
