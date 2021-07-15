package inheritance;

public class classB extends classA {
	
	public int a= 15;
	
	public void test(){
		int a= 25;
		
		System.out.println(a);
		System.out.println("this method call "+this.a);
		
		System.out.println("super method call " +super.a);
		
		System.out.println("Hii");
			

		
	}
	

}
