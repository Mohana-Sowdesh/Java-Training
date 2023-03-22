package questionnine;

import java.util.Scanner;

/* In the same program write your own exception classes to take care of Negative numbers and values out of range 
 * (0-100)*/

public class AverageMarks {
	public static void main(String[] args) throws NegativeNumberException,OutOfRangeException {
		System.out.println("Enter marks of 10 students:");
		int i=0,sum=0;
		String marks[] = new String[10];
		Scanner jc = new Scanner(System.in);
		
		for(i=0; i<10; i++)
		{
			try {
				marks[i] = jc.next();
	
				if(Integer.parseInt(marks[i])>100)
					throw new OutOfRangeException("Please enter numbers only between 0 and 100");
				if(Integer.parseInt(marks[i])<0)
					throw new NegativeNumberException("Please enter only positive numbers. Please enter numbers only between 0 and 100.");
	
			}		
			catch(NegativeNumberException errMsg){
				System.out.println(errMsg.getMessage());
			}
			catch(OutOfRangeException errMsg) {
				System.out.println(errMsg.getMessage());
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter only numbers");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(i=0; i<10; i++)
		{
			try {
				sum+= Integer.parseInt(marks[i]);
			}
			catch(NumberFormatException e) {
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		int average = sum/10;
		System.out.println("Average of 10 students is "+average);
	}
}

class NegativeNumberException extends Exception {
	public NegativeNumberException(String errMsg)
	{
		super(errMsg);
	}
}

class OutOfRangeException extends Exception {
	public OutOfRangeException(String errMsg) {
		super(errMsg);
	}
}

