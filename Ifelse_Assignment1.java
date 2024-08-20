package basicprograms;

public class Ifelse_Assignment1 {
	public static void main(String[] args) {
		char gender ='M';
		int age =60;
		if(gender=='F') {
			System.out.println("Travelling is free");
		}
		else if(gender=='M' && age<=12) {
				System.out.println("Ticket price is half");
			}
			else if(gender=='M' && age<=59){
				System.out.println("Ticket price is full");
			}
			else if(gender=='M' && age>=60){
				System.out.println("Senior citizen ticket");
			}
			else {
				System.out.println("Invalid gender");
			}
			}
			
			}
		
	


