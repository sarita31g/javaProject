package array;

public class duplicateNoOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//	
	String Names[]= {"sarita", "sagar", "Prashant", "Vidya", "Sarita", "sagar"};
	
		for (int i=0; i<(Names.length); i++ )
		{
			for (int j=i+1; j<Names.length; j++)
			{
				if ((Names[i].equalsIgnoreCase(Names[j])) && (i!=j))
				{
					System.out.println("Duplicate string is " +Names[i]);
				}
			
			}
		}
int a[] = {1,2,3,4,2,5,1} ;
System.out.println("Duplicate Number from given array is ");
for(int k=0; k<a.length; k++)
{
for (int l=k+1; l<a.length; l++)
{
if((a[k]==a[l])  && (k!=l))
{
	System.out.println(a[l]);
	}
}
}


	}
}


