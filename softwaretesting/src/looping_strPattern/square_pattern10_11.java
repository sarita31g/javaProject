package looping_strPattern;

public class square_pattern10_11 
{

	public static void main(String[] args) 
	{
		
		int row=5;
		int i;
		int j;
		int k;
//		for(i=1; i<=row; i++)
//		{
//			for (j=1; j<=row; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

// pattern 10
		
		for (i=1; i<=row; i++)
		{
			for (j=1; j<row-i; j++)
			{
				System.out.print(" ");
			}
			for (k=1;k<=row; k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------");

//Pattern 11
		for (i=1; i<=row; i++)
		{
			for (j=1; j<=row; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			for (k=0; k<=i-1; k++)
			{
				System.out.print(" ");
			}
		}
	}

}
