  
/**
 * Display String in reverse order word by word
 * @author Joel
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String a[] = input.split(" ");
		String reversedString ="";
		for(int i=0; i<a.length; i++) {
			if(i == a.length-1)
				reversedString = a[i] + reversedString;
			else
				reversedString = " " + a[i] + reversedString;
		}
		return reversedString;
	}

}