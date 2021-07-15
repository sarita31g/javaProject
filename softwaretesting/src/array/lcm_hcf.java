package array;

import java.util.Scanner;

public class lcm_hcf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int temp1=a;
		int temp2=b;
		int lcm=0;
		int HCF=0;
//1way- simple
		
		
		for (int i=1; i<=a; i++)
		{
			if (a%i==0 && b%i==0)
				HCF=i;
		}
		lcm=(a*b)/HCF;
		System.out.println("HCF of two Numbers "+a+ " & "+b+" is "+HCF);
		System.out.println("LCM of two Numbers "+a+ " & "+b+" is "+lcm);
//2 way- By swapping method
		
		while(a%b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		
		lcm=(temp1*temp2)/b;
		System.out.println("HCF of two Numbers is "+b);
		System.out.println("LCF of two Numbers is "+lcm);
		
		
// 3 WAY- bY Recurring method
		
		int g= findGCD(a,  b);
		System.out.println("HCF of two nunbers "+g);
	     
	    		 lcm=(temp1*temp2)/g;
	     System.out.println("HCF of two nunbers "+lcm);
	}

	private static int findGCD(int a, int b) {
		if (a%b==0)
			return b;
		else 
		return findGCD(b,a%b);
		
		
	}

}
