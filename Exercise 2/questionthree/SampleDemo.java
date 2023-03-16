package questionthree;

/* Try the previous program by replacing the return statement by System.exit(0) */

public class SampleDemo {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		try {
			//line 1
			String s = "Sirius";
			int index = s.charAt(7); //StringIndexOutOfBoundsException
			System.out.println("Quitting execution...");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	
	public static void main(String[] args) {
		SampleDemo s = new SampleDemo();
		s.mth1();
	}
}
