package ian;


public class Functions{

	public static String reverse(String text){
		return new StringBuffer(text).reverse().toString();
	}

	public static int countChar(String text){
		return text.length();
	}

}