package arrayAssignment;

public class Loop {

	public static void main(String[] args) {
		int[] rollno = new int[7];
		rollno[0] = 1;
		rollno [1] = 2;
		rollno[2] = 3;
		rollno [3] = 4;
		rollno[4] = 5;
		rollno [5] = 6;
		rollno[6] = 7;
		System.out.println("using for lopp");
		for(int i=0;i<rollno.length;i++) {
			System.out.println(rollno[i]);
		}
		System.out.println("using while lopp");
		int k=0;
		while(k<rollno.length) {
			System.out.println(rollno[k]);
			k++;
		}
		System.out.println("using do while lopp");
		int j=0;
		do {
			System.out.println(rollno[j]);
			j++;
		}while(j<rollno.length);
		System.out.println("using for lopp in backward direction");
		for(int m=rollno.length-1;m>=0;m--) {
			 System.out.println(rollno[m]);
		 }
		System.out.println("using while lopp in backward direction");
		int n =rollno.length-1;
		while(n>=0) {
			 System.out.println(rollno[n]);
			 n--;
		}
		System.out.println("using do while lopp in backward direction");
		int o=rollno.length-1;
		do {
			System.out.println(rollno[o]);
			o--;
		}while(o>=0);
		

	}

}
