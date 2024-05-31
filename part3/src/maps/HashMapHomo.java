package maps;
import java.util.HashMap;
public class HashMapHomo {
 public static void main(String[] args) {
	HashMap<Integer,String> indMap = new HashMap<Integer,String>();
	indMap.put(7, "dohni");
	indMap.put(8, "virat");
	indMap.put(10, "rohit");
	HashMap<Integer, String> ausmap = new HashMap<Integer, String>();
	ausmap.put(1, "smith");
	ausmap.put(2, "Warner");
	ausmap.put(3, "MaxWell");
	HashMap<Integer,String> iplmap = new HashMap<Integer,String>();
	iplmap.putAll(indMap);
	iplmap.putAll(ausmap);
	System.out.println(iplmap.size());
	System.out.println(iplmap.isEmpty());
	iplmap.remove(7);
	System.out.println(iplmap.containsKey(1));
	System.out.println(iplmap.containsValue("virat"));
	System.out.println(iplmap.get(8));
	System.out.println(iplmap.size());
	
	
}
} 
