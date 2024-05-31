package maps;

public class Student {
	static int sid;
	static String name;
	static String email;
	static long phnno;
	static String address;
 
 Student(int sId,String name,String email,long phnno,String address){
	 this.sid = sId;
	 this.name = name;
	 this.email = email;
	 this.phnno = phnno;
	 this.address = address;
 }
 public static void main(String[] args) {
	Student student = new Student(1, "shivani", "shivanimangla5607@gmail.com", 999130, "sdfgh");
}
}
