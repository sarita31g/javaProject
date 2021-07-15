package StringPrograms2;

public class reverseWordAndPositionAlso {

	public static void main(String[] args) {
		String Name= "Sarita is my name";
		String [] word= Name.split(" ");
		String revword="";
		String reverseString="";
		System.out.println("Original String is "+ Name);
		
		for (int i=0; i<word.length; i++)
		{
			String a= word[i];
			for (int j=(a.length())-1; j>=0;j--)
			{
				revword=revword+a.charAt(j);

			}
			 revword=revword+" "; 
		}
		System.out.println("Reversed word at the same position- " +revword);
		
		String [] revstring =revword.split(" ");
		
		for (int k=revstring.length-1; k>=0;k--)
		{
			reverseString=reverseString+ revstring[k]+ " ";
		}
		System.out.println("Reversed word & also reverse the position of the word- "+reverseString);

	}

}
