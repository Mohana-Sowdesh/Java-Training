package questionfive;

/* Write a class with a method at throws an exception the type created in the previous exercise.
 * Compile this without catch exception */

public class ExceptionHandling {
	public static void main(String[] args) {
		validate(300000);
		System.out.println("Code after validation of annual income");
	}
	
	public static void validate(int income) throws NotValidIncomeException {
		try {
			if(income > 200000)
				throw new NotValidIncomeException("Not eligible for scholarship");
			else
				System.out.println("Eligible for scholarship");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class NotValidIncomeException extends Exception {
	public NotValidIncomeException(String errMsg) {
		super(errMsg);
	}
}