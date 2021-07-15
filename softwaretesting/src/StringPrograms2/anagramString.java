package StringPrograms2;

import java.util.Arrays;

public class anagramString {

	public static void main(String[] args) {
		//Anagram String = Two string contains same character irrespective of the order of characters
		
		String s1 = "listen";
		String s2 = "silent";
		if (s1.length()!= s2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			char[] String1 = s1.toCharArray();
			char[] String2= s2.toCharArray();
			
//			Arrays.sort(String1);
//			Arrays.sort(String2);
			
			if (Arrays.equals(String1, String2)== true)
			{
				System.out.println("Both the strings are anagram");
			}
			else
			{
				System.out.println("Both the strings are not anagram");
			}
		}

	}

}
