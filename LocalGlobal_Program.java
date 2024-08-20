package basicprograms;

public class LocalGlobal_Program {
	
	static int a1=20;
	static int b1=10;
	double pi = 3.14;
	
	
	static void add() {
		System.out.println(a1+b1);
		
	}
	
 static void sub() {
		System.out.println(a1-b1);
	}
 
 static void mult() {
		System.out.println(a1*b1);
	}
	
 static void div() {
	 System.out.println(a1/b1);
		
	}
	
	
	public static void main(String[] args) {
		a1=55;
		add();
		sub();
		mult();
		div();
		LocalGlobal_Program l1 = new LocalGlobal_Program();
		l1.pi=5;
		System.out.println(l1.pi);
		
	}
}
