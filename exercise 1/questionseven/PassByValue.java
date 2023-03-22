package questionseven;

/* 1. Write a program to prove that Primitive data types are passed by value and object and arrays 
are passed by reference.*/

public class PassByValue {
	int num_var = 102;
	public static void main(String[] args) {
		int pass_int = 66;
		float pass_float = 98.3f;
		double pass_dbl = 34.26d;
		char pass_char = 'z';
		boolean pass_bool = true;
		long pass_long = 3444884884844484848L;
		short pass_short = 3438;
		
		//Pass by value for a variable
		System.out.println("Before passing value of the variable pass_int "+ pass_int);
		System.out.println("Before passing value of the variable pass_float "+ pass_float);
		System.out.println("Before passing value of the variable pass_dbl "+ pass_dbl);
		System.out.println("Before passing value of the variable pass_char "+ pass_char);
		System.out.println("Before passing value of the variable pass_bool "+ pass_bool);
		System.out.println("Before passing value of the variable pass_long "+ pass_long);
		System.out.println("Before passing value of the variable pass_short "+ pass_short);
		
		PassByValue ref = new PassByValue();
		ref.passByValue(pass_int);
		ref.passByValue(pass_float);
		ref.passByValue(pass_dbl);
		ref.passByValue(pass_char);
		ref.passByValue(pass_bool);
		ref.passByValue(pass_long);
		ref.passByValue(pass_short);
		
		System.out.println("\n\nAfter passing value of the variable pass_int "+ pass_int);
		System.out.println("After passing value of the variable pass_float "+ pass_float);
		System.out.println("After passing value of the variable pass_dbl "+ pass_dbl);
		System.out.println("After passing value of the variable pass_char "+ pass_char);
		System.out.println("After passing value of the variable pass_bool "+ pass_bool);
		System.out.println("After passing value of the variable pass_long "+ pass_long);
		System.out.println("After passing value of the variable pass_short "+ pass_short);
		
		PassByRef obj = new PassByRef();
		Employee emp = new Employee();
		
		// Pass by reference for an object
		System.out.println("\n\nBefore passing the object of Employee "+ emp.age);
		obj.passByRef(emp);
		System.out.println("After passing the object of Employee "+ emp.age);
		
		// Pass by reference for an array
		int arr[] = {95, 104, 76, 74, 81};
		System.out.println("\n\nBefore passing array:");
		for(int i: arr)
		{
			System.out.println(i+"\t");
		}
		obj.passingArray(arr);
		
		System.out.println("\nAfter passing array:");
		for(int i: arr)
		{
			System.out.println(i+"\t");
		}
	}

	public void passByValue(int pass_int)
	{
		pass_int = 91;
	}
	
	public void passByValue(float pass_float)
	{
		pass_float = 91.6662f;
	}
	
	public void passByValue(long pass_long)
	{
		pass_long = 166626263;
	}
	
	public void passByValue(char pass_char)
	{
		pass_char = 'd';
	}
	
	public void passByValue(short pass_short)
	{
		pass_short = 7775;
	}
	
	public void passByValue(double pass_dbl)
	{
		pass_dbl = 72325162272d;
	}
	
	public void passByValue(boolean pass_bool)
	{
		pass_bool = false;
	}
}

class Employee {
	int age = 73;
}

class PassByRef {
	public void passByRef(Employee emp)
	{
		emp.age = 15;
	}
	
	public void passingArray(int arr[]) {
		arr[0] = 107;
		arr[1] = 106;
		arr[3] = 112;
		arr[4] = 110;
	}
}