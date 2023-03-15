package questiontwo;

/* Try the following and observe the result. Also try it with a
statement throwing some exception in line 1 */

public class Sample {
	
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		try {
			//line 1
			String s = "Sirius";
			int index = s.charAt(7); //StringIndexOutOfBoundsException
			return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.mth1();
	}

}
