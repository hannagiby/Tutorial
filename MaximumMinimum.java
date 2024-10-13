package javalessons;
import java.util.Scanner;
public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the size of the array:");
		int n=sc.nextInt();
		int[]array=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i] +" ");
			
		}
		int max=array[0];
		int min=array[0];
		for(int i=1;i<n;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for(int i=1;i<n;i++)
		{
			if(array[i]<min);
			{
		        min=array[i];
			}
		}
		System.out.println("Maximum element in the array is:" +max);
		System.out.println("Minimum element in the array is:" +min);
		
	}

}
