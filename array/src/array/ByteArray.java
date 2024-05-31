package array;

public class ByteArray {
	 public static void main(String[] args) {
		 byte [] ar;
		 ar = new byte[5];
		 ar[0] = 1;
		 ar[1] = 2;
		 ar[2] = 3;
		 ar[3] = 4;
		 ar[4] = 5;
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
}
}
