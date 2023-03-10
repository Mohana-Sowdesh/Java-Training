package questionsix;

import java.util.Scanner;

/* 15. Write a program:
		a) To generate a Prime number list between 1 to 100 
		b) To check given number is an Armstrong number or perfect number 
		or palindrome or none of these */

public class TypeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfNumber ref = new TypeOfNumber();
		ref.primeNumbers();
		
		Scanner jc = new Scanner(System.in);
		System.out.println("\n\nEnter a number: ");
		int num = jc.nextInt();
		ref.armstrongNum(num);
		ref.perfectNum(num);
		ref.palindrome(num);
	}
	
	public void primeNumbers(){
		System.out.println("Printing prime numbers between 1 and 100:");
		System.out.println("1 is neither prime nor composite");
		
		for(int i=2;i<=100;i++)
		{
		     if(printPrimeNumbers(2,i)==0)
		    	 System.out.print(i+" ");
		}
	}
	
	public int printPrimeNumbers(int i, int num) {
		 if(num==i)
		     return 0;
		 else if(num%i==0)
		     return 1;
		 return printPrimeNumbers(i+1,num);
	}
	
	public void armstrongNum(int num) {
		int temp = num;
		int temp_var = num;
		int digit_cnt = 0;
		double sum = 0;
		while(num>0)
		{
			num = num/10;
			digit_cnt++;
		}
		
		while(temp>0)
		{
			int rem = temp%10;
			sum = sum + Math.pow(rem, digit_cnt);
			temp /= 10;
		}

		if(sum == temp_var)
			System.out.println(temp_var+" is an Armstrong number");
	}
	
	public void perfectNum(int num) {
		int sum=1;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i == 0)
				sum += i;
		}
		
		if(sum == num)
			System.out.println(num+ " is a perfect number");
	}
	
	public void palindrome(int num)
	{
		int temp = num,rev=0;
		while(temp>0)
		{
			int rem = temp%10;
			rev = (rev*10)+rem;
			temp /= 10;
		}
		
		if(rev == num)
			System.out.println(num + " is a palindrome");
	}

}
