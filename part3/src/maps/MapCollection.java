package maps;
	import java.util.HashMap;
	import java.util.Map;
	public class MapCollection {
		public static void main(String[] args) {
			Map<Integer, String> emp = new HashMap<Integer, String>();
			
			emp.put(1,"Shivani");
			emp.put(2,"Riya");
			emp.put(3,"Ansuli");
			System.out.println(emp);

			System.out.println("================================================");
			
			Map<Integer, String> emp1 = new HashMap<Integer, String>();
			
			emp1.put(4,"Manoj");
			emp1.put(5,"pulkit");
			emp1.put(6,"manish");
			System.out.println(emp1);

			System.out.println("================================================");
			Map<Integer, String> empFinal = new HashMap<Integer, String>();
			
			empFinal.putAll(emp);
			empFinal.putAll(emp1);
			
			System.out.println(empFinal);

			System.out.println("================================================");
			System.out.println("is  emp empty :" + emp.isEmpty());
			System.out.println("size of emp :" + emp.size());

			System.out.println("================================================");
			System.out.println("is  emp1 empty :" + emp1.isEmpty());
			System.out.println("size of emp1 :" + emp1.size());

			System.out.println("================================================");
			System.out.println("is  empFinal empty :" + empFinal.isEmpty());
			System.out.println("size of empFinal :" + empFinal.size());

			System.out.println("================================================");
			emp.remove(2);
			emp1.remove(6);
			System.out.println(emp.containsValue("Pulkit"));

			System.out.println(emp.containsValue("Monji"));

			System.out.println("================================================");
			System.out.println(emp1.containsKey(5));
			System.out.println(emp1.containsValue("Tony"));

			System.out.println("================================================");
			emp.get(1);
			emp1.get(5);
			

			System.out.println("================================================");
			System.out.println("After operations");
			
			
			System.out.println("is  emp empty :" + emp.isEmpty());
			System.out.println("size of emp :" + emp.size());
	System.out.println(emp);
	System.out.println("================================================");
			System.out.println("is  emp1 empty :" + emp1.isEmpty());
			System.out.println("size of emp1 :" + emp1.size());
	System.out.println(emp1);
	System.out.println("================================================");
			System.out.println("is  empFinal empty :" + empFinal.isEmpty());
			System.out.println("size of empFinal :" + empFinal.size());
			System.out.println(empFinal);

			System.out.println("================================================");
			
			System.out.println("key set");
			System.out.println(emp.keySet());
			System.out.println(emp1.keySet());
			System.out.println(empFinal.keySet());

			System.out.println("================================================");
			System.out.println("value set");
			System.out.println(emp.values());
			System.out.println(emp1.values());
			System.out.println(empFinal.values());

			System.out.println("================================================");
			System.out.println("entry set");
			System.out.println(emp.entrySet());
			System.out.println(emp1.entrySet());
			System.out.println(empFinal.entrySet());
			

			System.out.println("================================================");
			
			empFinal.clear();
			System.out.println(empFinal);
			
		}
	}

