package javalessons;
import java.util.Scanner;
class InvalidScoreException extends Exception{
	private String message;
    InvalidScoreException(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
	}
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score of student:");
		int score=sc.nextInt();
		try {
			if(score<=0||score>100) {
				throw new InvalidScoreException ("Score must be between 0 and 100");
			}
			else {
				System.out.println("Score of Student is"+score);
				}
		}
			catch(InvalidScoreException e) {
				System.out.println(e.getMessage());
				
			}
		}
		



}
