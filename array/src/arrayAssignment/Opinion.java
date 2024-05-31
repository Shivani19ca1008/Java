package arrayAssignment;

public class Opinion {
 public static void main(String[] args) {
	boolean[] opinion = new boolean[7];
	opinion[0] = true;
	opinion[1] = false;
	opinion[2] = true;
	opinion[3] = false;
	opinion[4] = true;
	opinion[5] = false;
	opinion[6] = false;
	for(int i =0;i<opinion.length;i++) {
		System.out.println(opinion[i]);
	}
}
}
