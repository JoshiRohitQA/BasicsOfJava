package basicprograms;

import java.util.Scanner;

public class AreaTrapezium {
	
	static void areaTrap() {
		System.out.println("Input the length of a");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Input the length of b");
		double b = sc.nextDouble();
		System.out.println("Input the length of h");
		double h = sc.nextDouble();
		sc.close();
		double area = ((a+b)*h)/2;
		System.out.println("Area of Trapezium->" + area);
		
	}
	public static void main(String[] args) {
		areaTrap();
	}

}
