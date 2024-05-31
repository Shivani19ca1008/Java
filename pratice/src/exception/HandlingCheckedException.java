package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HandlingCheckedException {
public static void main(String[] args) {
	try {	
		FileOutputStream f = new FileOutputStream("e://demo.txt");
	}
	catch(FileNotFoundException f){
		System.out.println("file not found");
	}
}
}
