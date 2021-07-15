package casting;

public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		classA x= new classA();
		x.demo();
		x.test();
		
		classB y= new classB();
		y.demo();
		y.test();
		
		classA z= new classB();
		z.demo();
		z.test();
		
		
	}

}
