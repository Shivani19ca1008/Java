package arrayAssignment;

public class Even {
 public static void main(String[] args) {
	 int[] rollno = new int[7];
		rollno[0] = 1;
		rollno[1] = 2;
		rollno[2] = 3;
		rollno[3] = 4;
		rollno[4] = 5;
		rollno [5] = 6;
		rollno[6] = 7;
		for(int i=0;i<rollno.length;i++) {
			if(rollno[i]%2==0) {
			 System.out.println(rollno[i]);
			}
		}
}
}
