package exception;

public class ThrowingUnheckedException {
public static void main(String[] args) {
	int a =15;
	int b = 10;
	if(a>b) {
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		
	}
	else {
		System.out.println("not");
	}
//	if(a>b) {
//		try {
//			throw new ArithmeticException("manually");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("handled");
//		}
//	}
//		else {
//			System.out.println("no exception");
//		}
//	public void getName(int id) {
//		if(this.id==id) {
//			System.out.println(name);
//		}
//		else {
//			try {
//				
//				throw new Invalid();
//			}
//			catch(InValid() i) {
//				System.out.println(id.getMessage());
//			}
//		}
//	}
}
}
