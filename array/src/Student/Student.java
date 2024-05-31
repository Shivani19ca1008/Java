package Student;

public class Student {
  String name;
  int roll;
  long phn;
  Student(String name,int roll,long phn){
	  this.name=name;
	  this.roll = roll;
	  this.phn=phn;
  }
  public static void main(String[] args) {
	  Student s1 = new Student("dev", 1, 2345677);
	  Student s2 = new Student("shivani", 2, 324356);
	  Student s3 = new Student("fghjh", 3, 2345677);
	  Student s4 = new Student("fdgh", 4, 324356);
	  Student s5 = new Student("riya", 5, 34565432);
	  Student [] s = {s1,s2,s3,s4,s5};
	  for(int i=0;i<s.length;i++) {
		  System.out.println(s[i].name);
		  System.out.println(s[i].roll);
		  System.out.println(s[i].phn);
	  }
	 
  }
}
