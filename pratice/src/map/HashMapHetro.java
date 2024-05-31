package map;

import java.util.HashMap;

public class HashMapHetro {
public static void main(String[] args) {
	HashMap<Integer, Object> h = new HashMap<Integer, Object>();
	h.put(1, "shivani");
	h.put(2, 45);
	h.put(3, 0.5);
	HashMap<Integer, Object> h1 = new HashMap<Integer, Object>();
	h1.putAll(h);
	System.out.println(h1);
	System.out.println(h1.containsKey(2));
	System.out.println(h1.containsValue(0.5));
	System.out.println(h1.get(1));
	System.out.println(h1.values());
	System.out.println(h1.keySet());
	System.out.println(h1.entrySet());
	
}
}
