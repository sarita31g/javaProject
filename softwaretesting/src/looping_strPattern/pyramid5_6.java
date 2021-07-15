package looping_strPattern;

public class pyramid5_6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		int row=5;
		
//Upper Pyramid with space
		
		for (a=1; a<=row; a++)
		{
			for (b=a; b<=(row-1); b++)
			{
				System.out.print(" ");
			}
			for (c=1; c<=a; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");

//Lower Pyramid with space
	for (a=1; a<=row; a++)
	{
		for (b=a; b<=row; b++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for (c=1; c<=a; c++)
		{
			System.out.print(" ");
		}
		
	}
	System.out.println("-------------------------------");

// Upper pyramid without space
	int i;
	int j;
	int s;
	for(i=1; i<=row; i++)
	{
		for (s=1; s<=(row-i); s++)
		{
			System.out.print(" ");
		}
		for (j=1; j<=(i*2)-1; j++)
		{ 
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("-----------------------------------");
	

	
// lower Pyramid without space
	for (i=1; i<=row; i++ )
	{
		for (j=i; j<=(row*2)-i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(s=1; s<=i; s++)
		{
			System.out.print(" "); 
		}
		
	}
	
	}

}
