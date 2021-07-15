package StringPrograms2;

public class palidromeString {

	public static void main(String[] args) {
		String a= "kayakn";	
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
