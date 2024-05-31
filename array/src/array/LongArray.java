package array;

public class LongArray {
	 public static void main(String[] args) {
		 long [] ar;
		 ar = new long[5];
		 ar[0] = 13456789l;
		 ar[1] = 2l;
		 ar[2] = 3l;
		 ar[3] = 4l;
		 ar[4] = 5l;
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
