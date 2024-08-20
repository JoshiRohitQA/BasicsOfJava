package basicprograms;

public class Amazon_Const {
	
	 Amazon_Const() {
		System.out.println("This is the Amazon constructor");
	}
	 
	 Amazon_Const(int a) {
			System.out.println("This is parameterized constructor");
		}
	 Amazon_Const(int a,double b){
		 System.out.println("This is paramertiezed with multple variable");
	 }

	
	public static void main(String[] args) {
		
		Amazon_Const a1 = new Amazon_Const(1,3.14);
		new Amazon_Const();
		new Amazon_Const(1);
		
	}
}
