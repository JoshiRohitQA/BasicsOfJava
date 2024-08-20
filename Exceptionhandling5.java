package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Exceptionhandling5 {
	public static void main(String[] args) {
		Scanner sc11 = new Scanner(System.in);
		int rollno[]=new int[4];
		try {
			System.out.println("Input the elements of array");
			for(int i=0;i<=rollno.length;i++) {
				rollno[i]=sc11.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("The no. of elements are more than the size of array");
		}
		
		finally {
			System.out.println(Arrays.toString(rollno));
		}
	}
	
}
