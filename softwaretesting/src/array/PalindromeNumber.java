package array;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) {
	    System.out.println("Enter a number ");
		Scanner b= new Scanner (System.in);
		int num= b.nextInt();
	
		int temp= num;
		int rev=0;
		while (temp>0)
		{
			
			rev=rev*10+ temp%10;    		// 0*10+2=2    2*10+3=23    23*10+4=234   234*10+1=2341
			temp=temp/10;   			   // 1432/10=143  143/10=14    14/10=1

		}
		
		if (num==rev)
		{
		  System.out.println(num+" Number is palindrome");	
		}
		else
		{
			System.out.println(num+" Number is not palidrome");
		}

	}

}
