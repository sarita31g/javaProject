package array;
import java.util.Arrays;
public class EvenOddSegregationAndStorageInArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  []a= {3,5,8,10,12,16,25,30,33}; 
	System.out.println("Size of aray a is " +a.length);
	System.out.println("Input Array a is " +Arrays.toString(a));
	

	int x=0;
	int y=0;
	int w[]=new int [a.length];
	int v [] =new int [a.length];
	for (int i=0; i<a.length; i++)
	{
		if (a[i]%2==0)
		{
			w[x]= a[i];
			x=x+1;	
		}
		else 
		{
			v[y]=a[i];
			y=y+1;
		}
			
	}
	System.out.println("Even numbers from input array a is " +Arrays.toString(w));
	System.out.println("Odd numbers from input array a is " +Arrays.toString(v));
 }
}


