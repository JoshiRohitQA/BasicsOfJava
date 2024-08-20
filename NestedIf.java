package basicprograms;

public class NestedIf {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a!=b) {
			
			if(a<6) {
				
				if(b==6) {
					System.out.println("1");
				}
				else {
					System.out.println("2");
				}
			}
			else {
				System.out.println("3");
			}
		}
		else {
			System.out.println("4");
		}
	}

}
