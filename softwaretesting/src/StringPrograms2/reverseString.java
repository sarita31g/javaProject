package StringPrograms2;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		String a= "sarita garje";
		String rev="";
//		System.out.println("Input string is "+a);

// 1 way		
//		for (int i= (a.length())-1; i>=0; i--)
//		{
//			rev= rev+ a.charAt(i);
//		}
//		System.out.println("Reverse string is "+rev);
	
// 2 way
//		char b[]= a.toCharArray();
//		for(int i= (a.length())-1; i>=0; i--)
//				{
//					rev= rev+b[i];
//					
//				}
//		System.out.println("Reverse string is "+rev);

// reverse String using Scanner
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Input String");
		String Name= sc.nextLine();
		for (int i=(Name.length()-1); i>=0; i--)
		{
			rev=rev+Name.charAt(i);
		}
		System.out.println("Reverse string using scanner "+rev);
		
// String in a pattern
	    String string = "SARITA  ";   
        System.out.println("Individual characters from given string: ");  
        for(int i = 0; i < string.length(); i++){ 
        	System.out.println();
            for(int j=0; j<=i;j++) {
        	System.out.print(string.charAt(i) + " "); 
            }
       } 
	
	}

}
