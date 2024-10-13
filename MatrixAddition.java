package javalessons;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix 1:");
		int row1=sc.nextInt();
		System.out.println("Enter the number of columns in the matrx1:");
		int column1=sc.nextInt();
		int[][]matrix1=new int[row1][column1];
		System.out.println("Enter the number of rows in the matrix2:");
		int row2=sc.nextInt();
		System.out.println("Enter the number of columns in the matrx2:");
		int column2=sc.nextInt();
		int[][]matrix2=new int[row1][column1];
		if(row1!=row2 && column1!=column2)
		{
			System.out.println("Invalid");
		}
		else
		{
		System.out.println("Enter the elements of the matrix1");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix1 is:");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(matrix1[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Enter the elements of the matrix2");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix2 is:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				System.out.print(matrix2[i][j] +" ");
			}
			System.out.println();
		}
		}
		int[][]matrix3=new int[row1][column1];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Matrix3 is:");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print(matrix3[i][j] +" ");
				}
				System.out.println();			}
			
		}
	}
