package basicprograms;

public class Global_variable {
	
	static double pi=3.14; 
	int number_of_days_leap_year= 366;
	
	
	public static void main(String[] args) {
		pi=5;
		System.out.println(pi);
		Global_variable g1 = new Global_variable();
		g1.number_of_days_leap_year=90;
		System.out.println(g1.number_of_days_leap_year);
		
	}

}
