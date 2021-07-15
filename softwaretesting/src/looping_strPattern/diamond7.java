package looping_strPattern;

public class diamond7 
{

	public static void main(String[] args)
	{

		int i;
		int s;
		int j;
		
		int row=7;
		int mid=(row+1)/2;
		for (i=1; i<=mid; i++)
		{
			for (s=0; s<=(mid-i); s++)
			{
				System.out.print(" ");
			}
				for (j=1; j<=(i*2)-1; j++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
			
			for (i=1; i<=(mid-1); i++)
			{
				
				
				for (s=1; s<=i+1; s++)
				{
					System.out.print(" ");
				}
				for (j=1; j<=((mid-i)*2)-1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
				
	}



