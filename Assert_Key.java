package basicprograms;

public class Assert_Key {
	
	public static void main(String[] args) {
		
		int a=10;
		
		assert a==10;
		
		String a1="Manish";
		
		assert a1.length()==6;
		
		System.out.println("First condition true");
	
		
   	 assert a>10 :("Sorry wrong value");
		System.out.println(a +100);
		
	}

}
