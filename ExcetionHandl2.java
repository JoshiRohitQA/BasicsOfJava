package basicprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetionHandl2 {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your age");
		try {
		int age = s1.nextInt();
		
		}
		catch(InputMismatchException i1) {
			System.out.println("Please read the question again");
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = s2.nextInt();
			
		}
		
		System.out.println("Enter your name");
		Scanner s3 = new Scanner(System.in);
		String name = s3.next();
		
		
	}

}
