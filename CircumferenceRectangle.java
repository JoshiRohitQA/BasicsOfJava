package basicprograms;

import java.util.Scanner;

public class CircumferenceRectangle {
	
	static void perimeterRect() {
			System.out.println("Input the length of a");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("Input the length of b");
			int b = sc.nextInt();
			sc.close();
			int perimeter = 2*(a+b);
			System.out.println("Circumference of Rectangle->" + perimeter);
			
		}
	
	public static void main(String[] args) {
		perimeterRect();
		
	}

}
