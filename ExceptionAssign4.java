package basicprograms;

public class ExceptionAssign4 {
	public static void main(String[] args) {
		String name="Rohit";
		try {
		System.out.println(name.charAt(5));
		}
		catch(StringIndexOutOfBoundsException a1) {
			System.out.println("The char position is more than the string has");
			System.out.println(name);
		}
		
	
	}

}
