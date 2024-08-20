package basicprograms;

import java.util.Scanner;

public class OddEven {
	
	static void oddevenMethod() {
		System.out.println("Input number to verify its even or odd");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n%2==0) {
			System.out.println("Number is even->" + n);
		}
		else {
			System.out.println("Number is odd->" + n);
		}
	}
	public static void main(String[] args) {
		oddevenMethod();
	}

}
