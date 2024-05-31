package arrayAssignment;

public class Employee {
	public static void main(String[] args) {
		int[] emp_id = new int[10];
		emp_id[0] = 1;
		emp_id[1] = 2;
		emp_id[2] = 3;
		emp_id[4] = 4;
		emp_id[5] = 5;
		emp_id[6] = 1;
		emp_id[7] = 2;
		emp_id[8] = 3;
		emp_id[9] = 4;
		
		for(int i=0;i<emp_id.length;i++) {
			System.out.println(emp_id[i]);
		}
		
		
	}
}
