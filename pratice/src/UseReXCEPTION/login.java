package UseReXCEPTION;

public class login {
	private int id;
	private String name;
	public  void getName(int id) {
		if(this.id==id) {
			System.out.println(name);
		}
		else {
			try {
				throw new InvalidPswrd();
			}
			catch(InvalidPswrd s) {
				System.out.println(s.getMessage());
			}
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public login() {
		super();
		this.name = name;
		this.id = id;
	}
 public static void main(String[] args) {
	login l = new login("riya",67);
	l.getName(6);
	System.out.println("thanks");
}
}
