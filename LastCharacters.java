package javalessons;
import java.util.Scanner;
public class LastCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int len=str.length();
		String s1=str.substring(0,2);
		String s2=str.substring(len-2);
		if(s1.equals(s2))
		{
			System.out.println("The first two characters appear at the end of the string");
			
		}
		else
		{
			System.out.println("The first two characters do not appear at the end of the string");
		}
		

	}

}
