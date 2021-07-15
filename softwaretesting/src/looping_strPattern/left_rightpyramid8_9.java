package looping_strPattern;

public class left_rightpyramid8_9 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int row=9;
int mid=(row+1)/2;
int i;
int j;
int s;
// 1st half diamond
  //upper triangle
	for (i=1; i<=mid; i++)
	{
		for (s=1; s<=(mid-i); s++)
		{
			System.out.print(" ");
		}
		for (j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println ();
	}
  // lower triangle
	for (i=1; i<=(mid-1); i++)
	{
		for (s=1; s<=i; s++)
		{
			System.out.print(" ");
		}
		for (j=1; j<=(mid-i); j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
// 2nd half diamond	
	//upper triangle
	for (i=1; i<=mid; i++)
	{
		for(j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		for (s=1; s<= (mid-i); s++)
		{
			System.out.print(" ");
		}
		System.out.println();
	}
   //lower triangle
	for (i=1; i<=(mid-1); i++)
	{
		for (j=1; j<=(mid-i); j++)
		{
			System.out.print("*");
		}
		for(s=1; s<=i; s++)
		{
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
	}
	

}
