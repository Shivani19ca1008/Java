package map;
import java.util.LinkedHashMap;
public class LinkedHashMapHetro {
	public static void main(String[] args) {
		LinkedHashMap <Integer, Object> h = new LinkedHashMap<Integer, Object>();
		h.put(1, "shivani");
		h.put(2, 45);
		h.put(3, 0.5);
		LinkedHashMap<Integer, Object> h1 = new LinkedHashMap<Integer, Object>();
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
