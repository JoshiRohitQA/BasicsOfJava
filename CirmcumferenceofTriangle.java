package basicprograms;

import java.util.Scanner;

public class CirmcumferenceofTriangle {
	
	static void perimeterTri() {
		System.out.println("Input the length of a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Input the length of b");
		int b = sc.nextInt();
		System.out.println("Input the length of c");
		int c = sc.nextInt();
		sc.close();
		int perimeter = a+b+c;
		System.out.println("Circumference of Triangel->" + perimeter);
		
		
	}
	public static void main(String[] args) {
		perimeterTri();
	}

}
