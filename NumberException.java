package javalessons;
import java.util.Scanner;
 class InvalidNumberException extends Exception{
	private String message;
	public InvalidNumberException(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
	}
	
}
public class NumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] A =new int[n];
		int sum=0,c=0;
		System.out.println("Enter the numbers:");
	    for(int i=0;i<n;i++) {
	    	A[i]=sc.nextInt();
	    	
	    }
	    System.out.println("The numbers are:");
	    for(int i=0;i<n;i++) {
	    	try {
	    		if(A[i]>0) {
	    			System.out.println(A[i]);
	    			sum=sum+A[i];
	    			c++;
	    		}
	    		else {
	    			throw new InvalidNumberException("Invalid Number "+A[i]);
	    			
	    		}
	    		
	    	}
	    	catch(InvalidNumberException e) {
	    		System.out.println(e.getMessage());
	    	}
	    	}
	    if(c>0) {
	     System.out.println("Th sum of positive numbers is"+sum);
	     float avg=sum/c;
	     System.out.println("The avaerage is:"+avg);
	    }}}
