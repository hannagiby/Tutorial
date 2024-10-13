package javalessons;
import java.util.Scanner;
class InvalidReservationException extends Exception{
	private String message;
	public InvalidReservationException(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
	}
	
}
public class HotelRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the slot no:");
		int s=sc.nextInt();
		try {
			if(s<=0) {
				throw new InvalidReservationException("Invalid");
			}
			else {
				System.out.println("Slot is registered");
				}
		}
			catch(InvalidReservationException e) {
				System.out.println(e.getMessage());
				
			}
		}
		

	}