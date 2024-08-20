package basicprograms;

import java.util.Scanner;

public class AreaofRectangle {
	
	static void areaRec() {
		System.out.println("Input the length of rectangle");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println("Input the breadth of rectangle");
		int breadth = sc.nextInt();
		sc.close();
		int area=length*breadth;
		System.out.println("Area of Rectangle is->" + area);
		
	}
	public static void main(String[] args) {
		areaRec();
		
	}

}
