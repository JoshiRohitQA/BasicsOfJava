package basicprograms;

public class Calling_static_nonstatic {
	
	static void add() {
		int a =20;
		int b=10;
		
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	void sub() {
		int a =20;
		int b=10;
		
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		add();
		Calling_static_nonstatic c1 = new Calling_static_nonstatic();
		c1.sub();
	}

}
