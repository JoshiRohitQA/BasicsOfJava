package basicprograms;


public class This_Key {
	int age;
	double salary;
	String name;
	
	void emplDetail(int age,double salary,String name) {
	/*	System.out.println("Age is ->"+age);
		System.out.println("Salary is->"+salary);
		System.out.println("Name is->"+name); */
		this.age = age;
		this.salary = salary;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		This_Key t1 = new This_Key();
		t1.emplDetail(12, 23.2, "Rohit");
		System.out.println(t1.age);
		System.out.println(t1.salary);
		System.out.println(t1.name); 
		
	}

}
