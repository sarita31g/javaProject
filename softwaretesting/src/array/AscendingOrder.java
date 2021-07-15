package array;

import java.util.Arrays;
import java.util.Collections;

public class AscendingOrder {

	public static void main(String[] args) {
		int a[]= {1,19,21,34,22,5,67,9};
		System.out.println("Input array is ");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
// 1 way 	
		Arrays.sort(a);													// Ascending order
		System.out.printf("modified a [] in ascending order:%s ", Arrays.toString(a) );
		 

// 2 way
//		System.out.println("Ascending array by sort method ");
//		Arrays.sort(a);
//		for (int i=0; i<a.length;i++)
//		{
//			System.out.print(" "+a[i]);
//		}
// 3 way
		int temp=0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])					// use < for descending order
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
	System.out.println("Ascending array is");
	for (int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
	
	
	}
	
	

}
