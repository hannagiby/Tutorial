package javalessons;
import java.util.Scanner;
public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int max;
		System.out.println("Enter the number of rows in the matrix:");
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
		for(int i=0;i<row;i++)
		{
			max=matrix[i][0];
			for(int j=0;j<column;j++)
			{
				if(matrix[i][j]>max)
				{
				 max=matrix[i][j];		
				 }
			}
	    System.out.println("Maximum element in each row"+(i+1)+":"+max);
		}
	}

}

