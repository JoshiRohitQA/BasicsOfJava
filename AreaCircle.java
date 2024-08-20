package basicprograms;

import java.util.Scanner;

public class AreaCircle {
	
	final static double pi = Math.PI;
	
	static void areaofCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius for the circle");
		double r = sc.nextInt();
		double area = pi*(r*r);
		System.out.println("Area of circle will be->"+ area);
		sc.close();
		
		
	}
	
	public static void main(String[] args) {
		areaofCircle();
	}

}
