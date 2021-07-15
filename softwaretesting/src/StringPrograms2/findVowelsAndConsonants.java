package StringPrograms2;

public class findVowelsAndConsonants
{

	public static void main(String[] args) 
	{
	 
		String str= "Sarita Vishwas Garje";
		
		str= str.toLowerCase();
		int cVowels=0;
		int cConsonants=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' )
			{
				cVowels++;
			}
			else 
			{
				if (str.charAt(i)>= 'a' && str.charAt(i)<= 'z')
				{
				 cConsonants++;
				}
			}
		}
		System.out.println("Vowels in a string are "+cVowels);
		System.out.println("Vowels in a Consonants are "+cConsonants);
	}

}
