package javalessons;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n=sc.nextInt();
		int [][]IdentityMatrix=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					IdentityMatrix[i][j]=1;			
					}
				else
				{
					IdentityMatrix[i][j]=0;
				}
			}
		}
		
		 System.out.println("The identity matrix is:");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print(IdentityMatrix[i][j] +" ");
			 }
			 System.out.println();
				 
		 }

	}

}
