package inhertanceExamples;

public class Semester extends Internal{
	void sumMark(int a, int b) {
		System.out.println(a+b);
	}
	void displayDetails(String name, String cname, String branch) {
		System.out.println("NAME: "+ name);
		System.out.println("Cname: "+cname);
		System.out.println("Bname: "+branch);
	}
	public static void main(String[] args) {
		Semester s = new Semester();
		s.sumMark(s.mark1, s.mark2);
		s.displayDetails(s.name, s.cname, s.branch);
	}
}
