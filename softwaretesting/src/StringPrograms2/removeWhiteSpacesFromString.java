package StringPrograms2;

public class removeWhiteSpacesFromString
{

	public static void main(String[] args) {
		String str= "Sarita Vishawas Garje";
// remove all white spaces from string
		String str1= str.replaceAll(" ", "");
		
		System.out.println(str1);
		
// Replace white spaces with specific character		
		String str2= str.replaceAll(" ", "@");
		System.out.println(str2);
		
	}
}
