package Exception;
public class Student {
private int id;
private String name;
	public  void getName(int id) {
		if(this.id==id) {
			System.out.println(name);
		}
		else {
			try {
				throw new Invalid();
			}
			catch(Invalid s) {
				System.out.println(s.getMessage());
			}
		}
	}
	public void setName(String name) {
		this.name = name;
	}
		Student(int id,String name){
			super();
			this.id = id;
			this.name = name;
		}
		public static void main(String[] args) {
			Student s = new Student(2,"shivani");
			s.getName(5);
		}
	
}

