package javalessons;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,i=1;
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		while(i<=n)
		{
			System.out.print(a+", ");
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		}

	}

}
