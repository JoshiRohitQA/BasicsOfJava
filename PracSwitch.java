package basicprograms;

import java.util.Scanner;

public class PracSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the desired symbol to perform action");
		int symbol = sc.nextInt();

		
		switch(symbol) {
		case 1:
			Scanner s1 = new Scanner(System.in);
			System.out.println("Input the first number");
			int a = sc.nextInt();
			System.out.println("Input second number");
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println(sum);
			break;
			
		case 2:
			Scanner s2 = new Scanner(System.in);
			System.out.println("Input the first number");
			int a1 = s2.nextInt();
			System.out.println("Input second number");
			int b1 = s2.nextInt();
			int diff = a1-b1;
			System.out.println(diff);
			s2.close();
			break;
			
			default : System.out.println("Invalid char");
			
			
		
			
		
		}
		
	}

}
