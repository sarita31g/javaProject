package array;

import java.util.Scanner;

public class prime_no 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
// Find Given number is Prime or Not
		System.out.println("Given number is prime or Not");
		int no=11;
		int temp=0;
		for (int i=2; i<=no-1; i++)
		{
			if (no%i==0)
			{
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println(no+ " is prime no");
		}
		else
		{
			System.out.println(no+ " is not prime no");
		}
	
	
// Find prime number within series
		System.out.println("Prime number witin a 1 to n Series");
		int temp1=0;
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=0; i<=n; i++)
		{
			for (int j=2; j<=i-1; j++)
			{
				if (i%j==0)
				{
					temp1=temp1+1;
				}
			}
			if (temp1==0)
			{
				System.out.print(i+ " " );
			}
			else
			{
			temp1=0;
			}
		}
		
// find prime number from array		
		/*System.out.println("Prime Number from Given array");
		int a[]= {2,3,5,7,8,9,10,11,12,13,14,15,16,17,1001,251,501,93,97};
	    int temp2=0;
	    for (int i=0; i<=a.length-1; i++)
	     {
	    	for (int j=2; j<=a[i]-1; j++)
	    	{
	    	
	    		if (a[i]%j==0)
	    		{
	    			temp2=temp2+1;
	    		}
	    	}
	    	if (temp2==0)
	    	{
	    		System.out.println(a[i]);
	    	}
	    	else 
	    	{
	    		temp2=0;
	    	}	    	 
	     }*/
		
	System.out.println();	
		int num= 15;
		int count=0; 
		
		if(num>1)
		{
		    for(int i=2;i<num;i++)
		    {
		    	if(num%i==0)
		    	{
		    	count++;   //0  0  0
		    	}
		    }
		    if(count==0)
		    {
		    	System.out.println(num+" Prime Number");
		    }
		    else
		    {
		    	System.out.println(num+" Not Prime Number");
		    }
		}
		else
		{
			System.out.println("Not Prime Number");
		}	
	}

}
