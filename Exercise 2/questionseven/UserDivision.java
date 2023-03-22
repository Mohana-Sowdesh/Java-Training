package questionseven;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a program such that the user is repeatedly asked for numerator and divisor. For each set of input
 * print an informative error or message if there is a problem.
 * 
 * a. Continues looping even if there is a problem
 * b. Exit the loop when data entered for the numerator start with characters 'q' or 'Q'*/

public class UserDivision {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		String numerator="", divisor="";
		
		while(true) {
			try {
				System.out.println("Enter numerator:");
				numerator = jc.next();
				
				if(numerator.charAt(0) =='q' || numerator.charAt(0) =='Q')
				{
					System.out.println("Quitting execution...");
					System.exit(0);
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter valid input");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				System.out.println("Enter divisor to divide:");
				divisor = jc.next();
				
				if(divisor.charAt(0) =='Q' ||  divisor.charAt(0) =='q')
				{
					System.out.println("Quitting execution...");
					System.exit(0);
				}
				
				double remainder = (double)(Integer.parseInt(numerator)/Integer.parseInt(divisor));
				System.out.println("Divident when "+numerator+" is divided by "+divisor+" is "+remainder);
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter valid input");
			}
			catch(ArithmeticException exp) {
				System.out.println("Cannot divide by 0");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
