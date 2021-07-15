package looping_strPattern;



public class problem12_13 {

	public static void main(String[] args) {
		int star;
		int space;
		int row=5;
		
		
// problem 12
		for (space=0; space<=row; space++)
		{ 
			System.out.println(" ");
			for (star=1; star<=row-space; star++)
			{
				System.out.print("*");
			}
		}

		for (space=2; space<=row; space++)
		{
			for (star=1; star<=space; star++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
	}
		
		System.out.println("----------------------------------------");

// Problem 13
		for (int line=1; line<=row; line++)
		{
			for(space=1; space<line; space++)
			{
				System.out.print(" ");
			}
			for(star=line; star<=row; star++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		for(int line=1; line<=(row-1); line++)
		{
			for (space=2; space<=(row-line);space++)
			{
				System.out.print(" ");
			}
			for(star=space-1; star<=row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

	
}
