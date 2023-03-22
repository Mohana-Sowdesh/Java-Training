package questionsix;

/* Write a program to check whether a derived class constructor can
 * catch exception thrown by a base class constructor */

public class ConstructorException {
	ConstructorException() throws InstantiationException{
		throw new InstantiationException();
	}
	
	public static void main(String[] args) throws InstantiationException {
		ConstructorException exception = new ChildConstructorException();
	}
}

class ChildConstructorException extends ConstructorException{
	ChildConstructorException() throws InstantiationException {
		try {
			throw new InstantiationException();
		}
		catch(Exception e) {
			System.out.println("Hi");
		}
	}
}