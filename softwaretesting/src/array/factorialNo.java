package array;

import java.util.Scanner;

public class factorialNo 
{

	public static void main(String[] args) 
	{
// factorial of Number means product of all descending integers. e.g. !4= 4*3*2*1
	
	System.out.println("Enter a Number");
	Scanner b= new Scanner(System.in);
	int num= b.nextInt();
	int fact=1;
	
	for (int i=1; i<=num; i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+num+" is "+fact);
	
	}	
}
