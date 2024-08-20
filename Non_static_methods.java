package basicprograms;

public class Non_static_methods {
	
	void add() {
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
		Non_static_methods n1 = new Non_static_methods();
		n1.add();
		n1.sub();
	}

}
