package javalessons;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rem,rev=0;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println("The reversed number is:" +rev);

	}

}
