package Encapsulation;

import java.util.jar.Attributes.Name;

public class Student {
 public static int id;
 public static String name;
 Student(int id,String name){
	 this.id=id;
	 this.name=name;
 }
 public static int getid() {
	  return id;
 }
 public static String getName() {
	  return name;
}
 
 
}
