package basicprograms;

import java.util.Date;

public class FindTime {
	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String time=d2.toString();
		String month = time.substring(4,7);
		System.out.println(month);
		String date = time.substring(8,10);
		System.out.println(date);
		String exactTime=time.substring(8,23);
		System.out.println(exactTime);
		String year = time.substring(time.length()-4);
		System.out.println(year);
		
		String dateFormat1= date.concat(month).concat(year);
		System.out.println(dateFormat1);
		
		String dateFormat2= date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(dateFormat2);
		
		String dateFormat3= date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateFormat3);
	}

}
