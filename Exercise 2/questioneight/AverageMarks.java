package questioneight;

import java.util.Scanner;

/* Write a program to take care of NumberFormatException if user enters values 
 * other than integers */

public class AverageMarks {
	public static void main(String[] args) throws NegativeNumberException {
		System.out.println("Enter marks of 10 students:");
		int i=0,sum=0;
		String marks[] = new String[10];
		Scanner jc = new Scanner(System.in);
		
		for(i=0; i<10; i++)
		{
			marks[i] = jc.next();
			try {
				if(Integer.parseInt(marks[i])<0)
					throw new NegativeNumberException("Please enter only positive numbers");
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter only numbers");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			sum+= Integer.parseInt(marks[i]);
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
