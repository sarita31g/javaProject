package array;

public class fibonacci_Series 
{

	public static void main(String[] args) 
	{
// Fibonacci Series means addition of preciding 2 nos is third no. i.e. 0+1=1, 1+1=2, 1+2=3, 2+3=5
	
		int n1=0, n2=1, sum=0;
	System.out.println(n1+ " " );
	for (int i=2; i<20; i++)
	{
		sum=n1+n2;
		System.out.println(sum);
		n1=n2;
		n2=sum;
	}

	}

}
