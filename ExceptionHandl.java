package basicprograms;

public class ExceptionHandl {
	
	public static void main(String[] args) {
		
	// int a =b/c;  // b is may be from grand parent class and c may be from parent class
		
		try {
		int c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1) {
			System.out.println("Handeled the exception");
			
		}
		
	}

}

