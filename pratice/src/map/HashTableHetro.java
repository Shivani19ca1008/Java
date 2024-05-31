package map;

import java.util.Hashtable;

public class HashTableHetro {
 public static void main(String[] args) {
	Hashtable<Integer,Object> ht = new Hashtable<Integer,Object>();
	ht.put(1, "shivani");
	ht.put(2, "jatin");
	ht.put(3, 9.7);
	ht.put(4, 0.6);
	System.out.println(ht.containsKey(2));
	System.out.println(ht.containsValue("shivani"));
//	System.out.println(ht.remove(2));
	System.out.println(ht.get(3));
	System.out.println(ht.values());
	System.out.println(ht.keySet());
	System.out.println(ht.entrySet());
	System.out.println(ht.size());
	System.out.println(ht.isEmpty());
	
	}
}
