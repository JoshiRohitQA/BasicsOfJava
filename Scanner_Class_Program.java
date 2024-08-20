package basicprograms;

import java.util.Scanner;

public class Scanner_Class_Program {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input String value");
		String a= s1.next(); 
		System.out.println("Input byte value");
		byte b = s1.nextByte();
		System.out.println("Input short value");
		short c= s1.nextShort();
		System.out.println("Input int value");
		int d= s1.nextInt();
		System.out.println("Input long value");
		long e= s1.nextLong();
		System.out.println("Input double value");
		double f= s1.nextDouble();
		System.out.println("Input float value");//type casting int value gets convert into float or double automatically
		float g=  s1.nextFloat();
		System.out.println("Input boolean value");
		boolean h= s1.nextBoolean();
		s1.close();
		         
		
	}

}
