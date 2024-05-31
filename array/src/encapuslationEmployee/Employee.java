package encapuslationEmployee;

public class Employee {
	private String ename;
	private int salary;
	private int pid;
	private int joining_date;
	private String cname;
	Employee(String ename,int salary,int pid,int joining_date,String cname){
		this.ename = ename;
		this.salary = salary;
		this.pid = pid;
		this.joining_date = joining_date;
		this.cname = cname;
	}
	public String getename() {
		return ename;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary() {
		this.salary = salary;
	}
	public int getpid() {
		return pid;
	}
	public int getjoiningdate() {
		return joining_date;
	}
	public void setjoiningdate() {
		this.joining_date = joining_date;
	}
	public String getcname() {
		return cname;
	}
 public static void main(String[] args) {
	Employee e = new Employee("shivani",345,4356,345,"dfg");
	
}
}
