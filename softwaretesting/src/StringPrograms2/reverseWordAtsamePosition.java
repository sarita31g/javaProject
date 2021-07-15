package StringPrograms2;

public class reverseWordAtsamePosition {

	public static void main(String[] args) {
		String Name= "Sarita is my name";
		String [] word= Name.split(" ");
		String revword="";
		
		System.out.println("Original String is- "+ Name);
		
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
		
	}

}
