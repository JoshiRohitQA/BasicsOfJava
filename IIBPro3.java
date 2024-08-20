package basicprograms;

public class IIBPro3 {
	
	static {
		System.out.println("SIB");
		
	}
	
	IIBPro3(){
		System.out.println("Constructor");
		
	}
	
	
	
	{
		System.out.println("IIB");
		
	}
	
	IIBPro3(int a){
		System.out.println("Constructor2");
		
	}
	
	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		new IIBPro3();
		new IIBPro3(1);
		
	}

}
