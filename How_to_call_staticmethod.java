package basicprograms;

public class How_to_call_staticmethod {
	
	static void addition() {
		System.out.println("I am your addition method");
	}
	
	static void subtraction() {
		System.out.println("I am your subtraction method");
	}
	
	static void multiply() {
		System.out.println("I am your multiplication method");
	}
	
	public static void main(String[] args) {
		System.out.println("I am your main method");
		addition();
		subtraction();
		multiply();
	}

}
