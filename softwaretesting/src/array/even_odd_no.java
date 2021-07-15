package array;

public class even_odd_no
{

	public static void main(String args []) 
	{
		// TODO Auto-generated method stub

		
	
		
// Number is Even OR Odd
		
		 /*	int i=5;
		if (i%2==0)
		{
			System.out.println(i+" Number is Even " );
		}
		else
		{
			System.out.println(i+" Number is Odd " );
		}
		*/
		
// Find Number is Even Or Odd from array
		int  []a= {3,5,8,10,12,16,25,30,33}; 
	System.out.println(a.length);
	
	System.out.println("Even Numbers");
	for (int i=0; i<a.length; i++)
	{
		if (a[i]%2==0)
		{
			System.out.println(a[i]);
		}
		
	}
	
	System.out.println("Odd Numbers");
	for(int i=0;i<a.length;i++)
	{
		if (a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
	}	
	
	
 // Enhanced for loop for array
	/*int k[]= {1,2,3,4,5,6};
	System.out.println("Even Nos from array");
	for (int value:k)
	{
		if (value%2==0)
		{
			System.out.println(value);
		}
	}
	System.out.println("Odd Nos from array");
	for (int value:k)
	{
		if (value%2!=0)
		{
			System.out.println(value);
		}
	}
		*/
		
  }

}
