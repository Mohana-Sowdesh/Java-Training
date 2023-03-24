package questionone;

import java.util.Scanner;

/* 14. Create a class Student consisting of name and rollno 
  as members. Create a class exam inheriting student. 
  It can have marks for 3 subjects. Create a class result inheriting 
  exam contaning totalmark as member and a function to calculate the
  totalmark.*/

public class Student {
	static String name;
	static String rollno;
	
	Student(String name, String rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name:");
		name = sc.next();
		
		System.out.println("Enter student rollno:");
		rollno = sc.next();
		
		Result res = new Result(name, rollno, 95, 91, 98);
		res.totalMarks();
	}

}

class Exam extends Student {
	int maths;
	int chemistry;
	int physics;
	
	Exam(String name, String rollno, int mat, int che, int phy) {
		super(name,rollno);
		this.maths = mat;
		this.chemistry = che;
		this.physics = phy;
	}
	
}
//total_marks
class Result extends Exam {
	int total_marks;
	
	Result(String name, String rollno, int mat, int che, int phy)
	{
		super(name, rollno, mat, che, phy);
	}
	
	public void totalMarks() {
		int total_marks = maths + chemistry + physics;
		System.out.println("Total marks of "+name+" is "+total_marks);
	}
}
