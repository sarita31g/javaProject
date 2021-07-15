package StringPrograms2;

public class CharatersCount_string
{

	public static void main(String[] args)
	{
		
		
		String Name= "Sarita Vishwas Garje";
		int count=0;
		
		
		for (int i=0; i<Name.length(); i++)
		{
			 if(Name.charAt(i) != ' ')    
			count++;
		}
	System.out.println(count);
	}

}
