package arrayAssignment;

public class Group {
 public static void main(String[] args) {
	 char[] group = new char[5];
		group[0] = 'a';
		group[1] = 'c';
		group[2] = 'd';
		group[3] = 'e';
		group[4] = 'd';
		for(int i=0;i<group.length;i++) {
			System.out.println(group[i]);
		}
}
}
