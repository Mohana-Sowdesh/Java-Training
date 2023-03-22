package questionfour;

/* Create your own exception. In main() create a try-catch clause to exercsie 
 * your new exception */

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			validate(300000);
		}
		catch(NotValidIncomeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Code after validation of annual income");
	}
	
	public static void validate(int income) throws NotValidIncomeException {
		if(income <= 200000)
			System.out.println("Eligible for scholarship");
		else
			throw new NotValidIncomeException("Not eligible for scholarship");
	}
}

class NotValidIncomeException extends Exception {
	public NotValidIncomeException(String errMsg) {
		super(errMsg);
	}
}

