package basicprograms;

import java.lang.reflect.Method;

public class Method_Overloading {
	
	 void add(int a) {
		System.out.println("1");
	}
	
  void add() {
	System.out.println("2");
		
	}
 void add(String a) {
	
	System.out.println("3");
	
}

 void add(String a,char b, double c) {
	
	System.out.println("4");
	
}
 
 static void add(boolean a) {
	 System.out.println("a");
 }

	public static void main(String[] args) {
	/*	add();
		add(100);
		add("Rohit");
		add("Test",'a',3.12);
		*/
		Method_Overloading m1 = new Method_Overloading();
		m1.add();
		m1.add("NonStatic");
		m1.add("Tested",'C',12.212);
		m1.add(300);
		add(true);
	}

}
