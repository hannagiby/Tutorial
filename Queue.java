package javalessons;
import java.util.Scanner;
class Q
{
	int[]q;
	int front,rear,n,size;
	Q(int n)
	{
		this.q=new int[n];
		this.n=n;
		front=0;
		rear=-1;
	}
	void enqueue(int item)
	{
		if(rear==n-1)
		{
			System.out.println("Queue overflow");
		}
		else
		{
			rear++;
			q[rear]=item;
			System.out.println("Element pushed");
		}
	}
	void dequeue()
	{
		if(rear<front)
		{
			System.out.println("Queue underflow");
		}
		else
		{
			System.out.println("The deleted element is:"+q[front]);
			front++;
		}
	}
	void display()
	{
		if(rear<front)
		{
			System.out.println("The queue is empty");
			
		}
		else
		{
			System.out.println("The queue is:");
			for(int i=front;i<rear;i++)
			{
				System.out.print(q[i]+" ");
			}
		}
	}
	
}

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		int choice;
		System.out.println("Ener the size:");
		int n=sc.nextInt();
		Q obj=new Q(n);
		do
		{
			System.out.println("Queue Operations");
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be inserted:");
				int item=sc.nextInt();
				obj.enqueue(item);
				break;
			case 2:
	
				obj.dequeue();
				break;

		    case 3:
		    	obj.display();
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
