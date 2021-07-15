package array;

public class amstrongno
{

	public static void main(String[] args)
	{
		
// Armstrong number is summation of cubes of its digits i.e. 153= (1*1*1)+(5*5*5)+(3*3*3) 
	
int a,amg,c=0;
int n=54748;
amg=n;
while (n!=0)
{
a=n%10;
c=c+(a*a*a*a*a);
n=n/10;
}

if (amg==c)
{
	System.out.println(amg+" is an armstrong number");
	}
else
{
	System.out.println( amg+" is not an armstrong number" );
	}
//Armstrong number using for loop
int no=54748;
int len=0;
int t=no;
while (t!=0)
{
t=t/10;
len=len+1;
}
System.out.println("length of a number is "+len);
int t1=no;
int rem=0;
int mul=1;
int arm=0;
while (t1!=0)
{
 rem=t1%10;

 for (int i=1; i<=len; i++)
 {
	 mul=mul*rem;
	 
 }
arm=arm+mul;
mul=1;
t1=t1/10;
}
	if (arm==no) {
		System.out.println(no+" is armstrong number " );
	}
	else {
		System.out.println(no+" is not armstrong number " );
	}

  }
	

}
