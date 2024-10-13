package javalessons;
import java.util.Scanner;
public class ElementPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int column=sc.nextInt();
		int[][]array=new int[row][column];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j] +" ");
			}
			System.out.println();

		}
		int n,count=0;
		System.out.println("Enter the element to be searched");
		n=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(array[i][j]==n)
				{
					System.out.println("The element is present in the array at position " +i+ ','+j);
					count++;
				}
			}
		}
		if(count==0)
		        {
					System.out.println("The element is not present");
				}
			}
		}

