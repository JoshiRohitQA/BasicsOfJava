package basicprograms;

import java.util.Scanner;

public class AreaofTriangle {
	
	static void areaTri() {
		System.out.println("Input the base of triangle");
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		System.out.println("Input the height");
		double height = sc.nextDouble();
		sc.close();
		double area= (base*height)/2;
		System.out.println("Area of Triangle is->"+ area);
		
	}
	
	public static void main(String[] args) {
		areaTri();
		
	}

}
