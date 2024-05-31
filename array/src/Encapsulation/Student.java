
package Encapsulation;

public class Student {
	private String name;
	private int phn_no;
	private int roll_no;
	private int mark;
	private String college_name;
	private int aadhar_no;
	Student(String name, int phn_no, int rollno,int mark,String college_name,int aadhar_no){
		this.name = name;
		this.phn_no = phn_no;
		this.mark = mark;
		this.college_name = college_name;
		this.aadhar_no = aadhar_no;
	}
	public String getName() {
		return name;
	}
	
	public int getPhnNo() {
		return phn_no;
	}
	public void setName() {
		this.name = name;
	}
	public int getrollno() {
		return roll_no;
	}
	public int getMark() {
		return mark;
	}
	public void setMark() {
		this.mark = mark;
	}
	public String getcollegeName() {
		return college_name;
	}
	public int AadharNo() {
		return aadhar_no;
	}
//	public static void main(String[] args) {
//		Student s1 = new Student("sdf",345,24,4,"sdfrgyh",3456);
//		System.out.println(s1.AadharNo());
//		
//	}

}
