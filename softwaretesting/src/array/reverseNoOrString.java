package array;

import java.util.Scanner;

public class reverseNoOrString 
{

	public static void main(String[] args) 
	{
// reverse Number i.e. 1432 to be 2341
		/*
		 System.out.println("Enter a number ");
		Scanner b= new Scanner (System.in);
		int num= b.nextInt();
		int rev=0;
		while (num!=0)
		{
			
			rev=rev*10+ num%10;  // 0*10+2=2    2*10+3=23    23*10+4=234   234*10+1=2341
			num=num/10;     // 1432/10=143  143/10=14    14/10=1
		}
		System.out.println("Reverse No is " +rev );
		*/
		
// Reverse array
		
		/*
		 int [] a = {1,2,3,4,5};
		 
		 System.out.println("Original input array is");
		 for (int i=0; i<a.length; i++)
		 {
			 System.out.print(a[i]+ " ");
		 }
		 System.out.println();
		 System.out.println("Reverse array is");
		 for (int i=a.length-1; i>=0; i--)
		 {
			 System.out.print(a[i]+" ");
		 }
		 */
		 
		
// reverse String i.e. SARITA to be ATIRAS	
//	
//		String a= "SARITA";
//	String rev="";
//	
//	
//	  int len= a.length();
//	 
//	for (int i=len-1; i>=0; i--)
//	{
//	 rev=rev+ a.charAt(i);	
//	}
//		System.out.println(rev);
	
	
// reverse string using toChararray()
//	String a= "SARITA GARJE";
//	String rev= "";
//	char b[]= a.toCharArray();
//	int len= b.length;
//	for (int i= len-1; i>=0; i--)
//	{
//		rev=rev+b[i];
//	}
//	System.out.println(rev);
	
	// palindrome string
		
	String a= "kayak";	
	String rev="";
	int len= a.length();
 
   for (int i=len-1; i>=0; i--)
	{
	 rev=rev+ a.charAt(i);	
	}
   
    if(a.equals(rev))    
        System.out.println("Given string is palindrome");    
    else    
        System.out.println("Given string is not a palindrome");    
		
		
	}

}
