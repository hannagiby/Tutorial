package javalessons;
import java.util.Scanner;
class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in the 2D matrix");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns in the 2D matrix");
		int column=sc.nextInt();
		int[][]matrix=new int[row][column];
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the scala value to multiply with the matrix:");
		int scalar=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scalar*matrix[i][j];
				}
		}
		System.out.println("The resulting matrix after scalar multiplication is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();			}
	}
}
