package javalessons;
import java.util.Scanner;
public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=new String();
		s1=sc.next();
		System.out.println("Enter the character to be removed:");
		char ch=sc.next().charAt(0);
		String s2=s1.replaceAll(String.valueOf(ch),"");
		System.out.println("New string is:"+s2);
	}

}
