package java2024;
import evenpackage.Even;
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int e=Even.checkNumber(num);
		if(e==1) {
			System.out.println("Even");
		}
			else {
				System.out.println("Odd");
			}
	}

}
