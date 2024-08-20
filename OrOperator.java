package basicprograms;


public class OrOperator {
	public static void main(String[] args) {
		int a =10;
		int b=20;
		
		if(a==10 || a==b) {
			System.out.println("Learning Or operator");
		}
		
		if(a==10 && b==20) {
			System.out.println("Learning AND operator");
		}
		
		if(!(a==11 || b==21)) {
			System.out.println("Learning Not operator");
		}
	}

}
