package maps;
import java.util.HashMap;
import java.util.Map;
public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer, String> indMap = new HashMap<Integer,String>();
	indMap.put(7, "dohni");
	indMap.put(8, "virat");
	System.out.println(indMap);
	indMap.put(8, "rohit");
	System.out.println(indMap);
	
}
}
