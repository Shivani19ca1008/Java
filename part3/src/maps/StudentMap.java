package maps;
import java.util.*;
import maps.Student;
public class StudentMap {
 public static void main(String[] args) {
	HashMap< Integer, String> student = new HashMap<Integer, String>();
	student.put(Student.sid, Student.name);
	System.out.println(student);
	
}
}

