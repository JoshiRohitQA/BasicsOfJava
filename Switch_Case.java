package basicprograms;

import java.util.Scanner;

public class Switch_Case {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for chrome");
		System.out.println("Press 2 for edge");
		System.out.println("Press 3 for firefox");
		int browser_select = sc.nextInt();
		sc.close();
		
		switch(browser_select)
		{
		case 1: System.out.println("Launch chrome browser");
		        break;
		case 2: System.out.println("Launch Firefox browser");
		        break;
		case 3: System.out.println("Launch edge browser");
		        break;
		default:
		       System.out.println("Sorry selection is wrong");
		       
		}

	}

}
