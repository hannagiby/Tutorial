package javalessons;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the positive number:");
	    n=sc.nextInt();
	    int i=1,factorial=1;
	    while(i<=n)
	    {
	    	factorial*=i;
	    	i++;
	    
	    }
	    System.out.println("The factorial is\n" +factorial);
	}

}
