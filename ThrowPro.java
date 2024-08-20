package basicprograms;

public class ThrowPro {
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		Thread.sleep(2000);
		throw new NullPointerException("Sorry file is empty");
		
	}

}
