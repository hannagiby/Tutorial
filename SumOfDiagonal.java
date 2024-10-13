package javalessons;
import java.util.Scanner;
public class SumOfDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		int[][]matrix=new int[n][n];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		int diagonal1=0;
		int diagonal2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					diagonal1+=matrix[i][j];
				}
				else if((i+j)==n-1)
				{
					diagonal2+=matrix[i][j];
				
				}
			}
			
		}
		System.out.println("Diagonal 1 sum:" +diagonal1);
		System.out.println("Diagonal 2 sum:" +diagonal2);		

	}

}
