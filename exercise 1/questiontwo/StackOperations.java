package questiontwo;

import java.util.Scanner;

/*3. Write a program in which stack interface with two methods push() and pop() will be 
 implemented by classes "Fixed Stack" and "Dynamic Stack".*/

interface Stack {
	void push(int a);
	void pop();
}

public class StackOperations {
	public static void main(String[] args) {
		FixedStack fs = new FixedStack();
		fs.createStack();
		
		System.out.println("Fixed Stack:");
		fs.push(543);
		fs.push(453);
		fs.push(671);
		fs.push(671);
		fs.push(671);
		fs.push(671);
		
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
		
		DynamicStack ds = new DynamicStack();
		
		System.out.println("\n\nDynamic Stack:");
		ds.push(15);
		ds.push(987);
		ds.push(747);
		
		ds.pop();
		ds.pop();
		ds.pop();
	}
}

class FixedStack implements Stack{
	int stack[] = new int[5];
	int ctr = 0;
	
	public void createStack() {
		stack[0] = -1;
	}
	
	public void printStack() {
		for(int i=0; i<5; i++)
		{
			if(stack[0] != -1)
			{
				System.out.println(stack[i]+" ");
			}
			else
				System.out.println("No elements to print");
		}
	}
	
	@Override
	public void push(int num) {
		if(ctr<=4) {
			stack[ctr] = num;
			ctr++;
			System.out.println("\nStack after pushing elements:");
			printStack();
		}
		else {
			System.out.println("Stack size is only 5. Please enter only 5 elements");
		}
	}
	
	@Override
	public void pop() {
		if(stack[0]==-1 || ctr==0)
			System.out.println("Stack size 0. No elements to pop");
		else {
			ctr--;
			stack[ctr] = 2147483647;
			System.out.println("\nStack after popping 1 element:");
			printStack();
		}
	}
}


class DynamicStack implements Stack {
	
	Node start = null;
	Node temp = null;
	
	public void printStack() {
		if(start!=null) {
			Node t = start;
			System.out.println("Printing stack:");
			while(t!=null) {
				System.out.println(t.num);
				t = t.next;
			}
		}
		else
			System.out.println("Stack is empty");
	}
	
	@Override
	public void push(int num) {
		Node stack = new Node(num);
		
		if(start==null)
		{
			start = stack;
			temp = stack;
		}
		else
		{
			temp.next = stack;
			temp = stack;
		}
		System.out.println("\nAfter pushing:");
		printStack();
	}
	
	@Override
	public void pop() {
		if(start.next!=null)
		{
			Node t = start;
			while(t.next.next!=null) {
				t = t.next;
			}
			t.next = null;
		}
		else
			start = null;
		
		System.out.println("\nAfter popping:");
		printStack();
	}
}

class Node {
	int num;
	Node next;
	
	 public Node(int num) {    
         this.num = num;    
         this.next = null;    
     }  
}