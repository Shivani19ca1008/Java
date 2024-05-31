package maps;

	import java.util.ArrayList;
	import java.util.List;

	public class ListMethod {
		public static void main(String[] args) {
			System.out.println("================================================");
			List<Integer> emp = new ArrayList<Integer>();
			
			emp.add(1);
			emp.add(2);
			emp.add(3);
			
			System.out.println(emp.size());
			System.out.println(emp.isEmpty());
			System.out.println(emp);

			System.out.println("================================================");
			List<String> emp1 = new ArrayList<String>();
			
			emp1.add("Pulkit");
			emp1.add("Monji");
			emp1.add("Manisha");
			System.out.println(emp1.size());
			System.out.println(emp1.isEmpty());
			System.out.println(emp1);

			System.out.println("================================================");
			List empFinal = new ArrayList();
			
			empFinal.addAll(emp);
			empFinal.addAll(emp1);
			System.out.println(empFinal.size());
			System.out.println(empFinal.isEmpty());
			System.out.println(empFinal);
			

			System.out.println("================================================");
			System.out.println("remove");
			
			emp.remove(1);
			emp1.remove("Manisha");
			empFinal.remove(2);
			System.out.println(emp);
			System.out.println(emp1);
			System.out.println(empFinal);

			System.out.println("================================================");
			System.out.println("removeAll");
			empFinal.removeAll(emp);

			System.out.println("================================================");
			System.out.println("Contains");
			
			emp.contains(1);
			emp.contains(2);
			emp1.contains("Pulkit");
			emp1.contains("Manisha");
			empFinal.contains(2);
			empFinal.containsAll(emp);

			System.out.println("================================================");
			System.out.println("retainAll");
			System.out.println(empFinal.retainAll(emp1));

			System.out.println("================================================");
			System.out.println("Size :");
			System.out.println(emp.size());
			System.out.println(emp1.size());
			System.out.println(empFinal.size());

			System.out.println("================================================");
			System.out.println("To Array");
			
			System.out.println(emp.toArray());
			System.out.println(emp1.toArray());
			System.out.println(empFinal.toArray());
			

			System.out.println("================================================");
			System.out.println("Iterator");
			
			for (Object object : emp) {
				System.out.print(object);
			}
			System.out.println("================================================");
			for (Object object : emp1) {
				System.out.print(object);
			}
			System.out.println("================================================");
			for (Object object : empFinal) {
				System.out.print(object);
			}

			System.out.println("================================================");
			System.out.println("Iterator");
			System.out.println(emp.iterator());
			System.out.println(emp1.iterator());
			System.out.println(empFinal.iterator());
			
			System.out.println("================================================");
			System.out.println("List Iterator");
			
			System.out.println(emp.listIterator());
			System.out.println(emp1.listIterator());
			System.out.println(empFinal.listIterator());
			
		}
	}

