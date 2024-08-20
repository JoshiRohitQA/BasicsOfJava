package basicprograms;

import java.util.Scanner;

public class CircumferenceCircle {
	
	final static double pi = Math.PI;
	
	static void circumCir() {
		System.out.println("Input radius of circle");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double circum = 2*pi*radius;
		System.out.println("Circumference of Circle is ->" + circum);
		
	}
	public static void main(String[] args) {
		circumCir();
		
	}

}
