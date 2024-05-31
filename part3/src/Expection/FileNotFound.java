package Expection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFound {
 public static void main(String[] args) throws FileNotFoundException{
	 try {
		 FileOutputStream f = new FileOutputStream("c:part3/abc");
	 }
	 catch(FileNotFoundException f){
		 System.out.println("file not found");
	 }
}
}
