package looping_strPattern;

public class problem14 
{

	public static void main(String[] args) 
	{
		int row=7;
		int line;
		int space;
		int star;
		
		for (line=1; line<=row; line++) 
			{
			for (space=1; space<line; space++)
			{
				System.out.print(" ");
			
			}
			for (star=space; star<=row; star++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	for (line=1; line<=(row-1); line++)
		{
			for (space=1; space<(row-line); space++)
			{
				System.out.print(" ");
			}
			for (star=space; star<=row; star++)
			{
				System.out.print("* ");
			}
		System.out.println();		
		}
	}
				
	
}
	


