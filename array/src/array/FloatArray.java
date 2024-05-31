package array;

public class FloatArray {
	 public static void main(String[] args) {
		 float [] ar;
		 ar = new float[5];
		 ar[0] = 1.0f;
		 ar[1] = 2.2f;
		 ar[2] = 3.1f;
		 ar[3] = 4.2f;
		 ar[4] = 5.4f;
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
