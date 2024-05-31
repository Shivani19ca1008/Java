package array;

public class BooleanArray {
	 public static void main(String[] args) {
		 boolean [] ar;
		 ar = new boolean[5];
		 ar[0] = true;
		 ar[1] = false;
		 ar[2] = true;
		 ar[3] = false;
		 ar[4] = true;
		System.out.println("using for loop");
		 for(int i=0;i<ar.length;i++) {
			 System.out.println(ar[i]);
		 }
		 System.out.println("using while loop");
		 int j=0;
		 while(j<ar.length) {
			 System.out.println(ar[j]);
			 j++;
		 }
		 System.out.println("using  do while loop");
		 int k =0;
		 do {
			 System.out.println(ar[k]);
			 k++;
		 }while(k<ar.length);
		 System.out.println("using  for loop print backward direction");
		 for(int m=ar.length-1;m>=0;m--) {
			 System.out.println(ar[m]);
		 }
	 }
}
