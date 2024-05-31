package map;

import java.util.TreeMap;

public class TreeMapHetro {
public static void main(String[] args) {
	TreeMap<Integer,Object> t = new TreeMap<Integer, Object>();
	t.put(1, "shivani");
	t.put(2, 3);
	System.out.println(t);
}
}
