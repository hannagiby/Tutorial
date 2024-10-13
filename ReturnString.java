package javalessons;
import java.util.Scanner;
public class ReturnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int len=str.length();
		String s1=str.substring(0,1);
		String s2=str.substring(len-1);
		String s3=str.substring(0,len-1);
		String s4=str.substring(1,len-1);
		if(s1.equals(s2))
		{
			System.out.println("First and last characters are same");
			System.out.println(s3);
			return;
		}
		else
		{
			System.out.println("First and last characters are not same");
			System.out.println(s4);
			return;
		}
 }

}
