package javalessons;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count;
		System.out.println("Prime numbers between 1 and 100 are: ");
		for(int i=2;i<100;i++)
		{
			count=0;
	      for(int j=2;j<i;j++)
	      {
	    	  if(i%j==0)
	    	  {
	    	  count++;
	    	  break;
	    	  }
	      }
		if(count==0)
		{
			System.out.println(i);
		}
		}

	}

}
