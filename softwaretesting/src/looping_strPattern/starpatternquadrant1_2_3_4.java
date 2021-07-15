package looping_strPattern;

public class starpatternquadrant1_2_3_4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int row= 4;
	
// 1st quadrant star printing
		
		for (a=1; a<=row; a++)
		{
		
			
			for (b=a; b<=(row-1) ; b++)
			{
				System.out.print(" ");
			}
			for (c=1; c<=a; c++)
			{	
				System.out.print("*");
			}
			System.out.println(" ");
		}
           System.out.println("---------------------");
           
// 2nd quadrant star printing
		for (a=1; a<=row; a++)
		{
			for (b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------");

// 3rd quadrant star printing
				
				for (a=row; a>=1; a--)
				{
					for(b=1; b<=a; b++)
					{
						System.out.print("*");	
					}
					System.out.println();
					
				}
				System.out.println("---------------------");
				
// 4th quadrant star printing
				
				for (a=1; a<=row; a++)
				{
					for (b=a; b<=row ; b++)
					{
						System.out.print("*");
					}
					
					System.out.println(" ");
					
					for (c=1; c<=a; c++)
					{	
						System.out.print(" ");
					}
					
				}
		
		
		
		
		
		//System.out.println(" ");
		
		//for (int a=1; a<=5; a++)
		//{
			//for (int b=1; b<=a; b++)
			//{
			//	System.out.print("*");
			//}
			//System.out.println("  ");
		//}
	
	}

}
