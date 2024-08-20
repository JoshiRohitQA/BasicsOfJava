package basicprograms;

public class ForLoop2 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=-10;i<=10;i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
	}

}
