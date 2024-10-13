package javalessons;
import java.util.Scanner;
public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int len=str.length();
		int cha=0,digit=0,space=0,line=0,alp=0,word=0,spl=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				alp++;
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				digit++;
			}
			else if(str.charAt(i)=='\n')
			{
				line++;
			}
			else if(str.charAt(i)==' ')
			{
				space++;
			}
			else
			{
				spl++;
				
				
			}
	}
		cha=alp+digit+spl;
		word=space+1;
		line=line+1;

			System.out.println("The number of alpabets is:" +alp);
			System.out.println("The number of digits is:" +digit);
			System.out.println("The number of lines is:" +line);
			System.out.println("The number of words is:" +word);
			System.out.println("The number of characters is:" +cha);
			System.out.println("The number of white spaces is:" +space);

	}

}
