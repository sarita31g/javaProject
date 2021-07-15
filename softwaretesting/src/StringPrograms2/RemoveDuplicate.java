package StringPrograms2;

import java.util.Scanner;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		System.out.println("Enter a String ");
		Scanner sc=  new Scanner (System.in);
		String Str = sc.nextLine();
		// Approach 1 		
		String newStr="";
		for (int i=0; i<Str.length(); i++)
		{
			char ch= Str.charAt(i);
			if (ch!= ' ')
			if (newStr.indexOf(ch)==-1)
			{
				newStr = newStr+ch;
			}
	
		//String Str = "my name is sarita";
		}
		System.out.println("Original String is "+Str);
		System.out.println("New String after removing duplicate charachters is " +newStr);

// 		
	char [] ch = Str.toCharArray();
	System.out.println("The input string is "+Str);
	
	for (int i=0; i<Str.length(); i++)
	{
		for (int j= i+1; j<Str.length(); j++)
		{
			if (ch[i]==ch[j]  )
			{
			
				System.out.print(ch[j]+ "");
				break;
			}
				
		}
	}
	
	
	}
}	
