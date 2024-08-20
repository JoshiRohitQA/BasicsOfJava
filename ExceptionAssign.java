package basicprograms;

import java.util.Arrays;
import java.util.InputMismatchException;


public class ExceptionAssign {
	public static void main(String[] args) {
		
		int rollno[]=new int[4];
		rollno[0]=23;
		rollno[1]=232;
		rollno[2]=2322;
		rollno[3]=3432;
		try {
		rollno[4]=231;
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("Arrays size is 4 so will accept upto roll[3] only");
		}
		catch(InputMismatchException a2) {
			System.out.println("Arrays having mismatch value which is not possible");
			}
		finally {
			System.out.println("Thanks for choosing the app");
			
		}
		System.out.println(Arrays.toString(rollno));
	
		
		
	}
}

