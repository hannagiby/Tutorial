package javalessons;
import java.util.Scanner;
class S
{
	int item,top,n;
	int []s;
	S(int n )
	{
		this.n=n;
		this.top=-1;
		this.s=new int[n];
		
		
	}
	void push(int item)
	{
		if(top>=n-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			this.item=item;
			s[top]=item;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("The element deleted is:"+s[top]);
			top--;
		}
	}
	void full() {
		if(top==n-1)
		{
			System.out.println("Stack is full");
			
		}
		else
		{
			System.out.println("Stack not full");
			
		}
	}
	void empty()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
	}
}
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		int choice;
		System.out.println("Ener the size:");
		int n=sc.nextInt();
		S obj=new S(n);
		do
		{
			System.out.println("Stack Operations");
			System.out.println("\n1.Push\n2.Pop\n3.IsFull\n4.IsEmpty");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be inserted:");
				int item=sc.nextInt();
				obj.push(item);
				break;
			case 2:
	
				obj.pop();
				break;

		    case 3:
		    	obj.full();
		    	break;
		    case 4:
		    	obj.empty();
		    	break;
		    	default:
		
		    		System.out.println("Invalid");
		    		break;
		    	}
			System.out.println("Do you want to continue or not(Y/N):");
			ch=sc.next().charAt(0);
					
			}

		while(ch=='y'||ch=='Y');
		System.out.println("Exiting....");
		sc.close();
	}
	}

			
		


