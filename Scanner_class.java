package basicprograms;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args) {
		
		//Lets do addition of 2 numbers while runtime
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum of two numbers are ->" + sum);
		System.out.println("Sub of two numbers are ->" + sub);
		System.out.println("Mult of two numbers are ->" + mul);
		System.out.println("Div of two numbers are ->" + div);
		System.out.println("Mod of two numbers are ->" + mod);
	}

}

//System.in -to take the value at run time
//System.out- to print the value