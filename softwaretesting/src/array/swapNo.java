package array;

public class swapNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Without using Third variable
		int a=10, b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is" +a);
		System.out.println("b is" +b);
		
		
		System.out.println("----------------------");
//Using Third variable
		
		int i=30 , j=50, k;
		k=j;
		j=i;
		i=k;
		System.out.println("i is" +i);
		System.out.println("j is" +j);
		
		
		
		
		
	}

}
