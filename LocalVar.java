package basicprograms;

public class LocalVar {
	
	static void add() {
		int a = 10;
		int b=20;
		int sum =a+b;
		System.out.println(sum);
		
	}
	
	void div() {
		int c = 50;
		int d = 5;
		int div = c/d;
		System.out.println(div);
		
	}
	
	public static void main(String[] args) {
		add();
		LocalVar l1 = new LocalVar();
		l1.div();

	}

}
