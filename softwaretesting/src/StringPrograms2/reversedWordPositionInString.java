package StringPrograms2;

public class reversedWordPositionInString {

	public static void main(String[] args) {
		String a= "Sarita is my name";
		String b[]= a.split(" ");
		String c=" ";
		String d=" ";
		String rev="";
		for (int i=0; i<b.length; i++)
		{
			d=d+b[i]+" ";
		}
		System.out.print("Original String is "+d);
		System.out.println();
		

		
		for(int j=(b.length-1); j>=0; j--)
		{			
			c= c+b[j]+" ";
			
		}
		System.out.print("Reversed Words of a given string is " +c);
		
			
			
	}
		

}
