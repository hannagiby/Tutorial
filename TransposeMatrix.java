package javalessons;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the number of rows in the matrix:");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns in the matrix:");
		int column=sc.nextInt();
		int[][]matrix=new int[row][column];
		System.out.println("Enter the elements of the matrix:");
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
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		int[][]TransposeMatrix=new int[column][row];
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
			 TransposeMatrix[i][j]=matrix[j][i];
			}
		}
		System.out.println("The transpose matrix is:");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
			 System.out.print(TransposeMatrix[i][j] +" ");
			}
			System.out.println();
		}
	}

}
