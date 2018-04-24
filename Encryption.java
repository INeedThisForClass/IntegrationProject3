package integrationproject;

import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Encryption {

	protected static Random random = new Random(); //Static field
	protected int key = random.nextInt(4) + 2;

	//these two methods are defined and overriden in the subclass
	public abstract String encrypt(String message);
	public abstract String decrypt(String message);

	public int getKey() {
		return key;
	}

	protected int getLength(String message) {
		return message.length();
	}

	public void inspect(String message) {
		System.out.println("-------   Debug Message  -------");
		System.out.print("encryption shift: " + key + ", ");
		System.out.print("text length: " + message.length() + ", ");
		System.out.print("chars: ");
		for (int i = 0; i < message.length(); i++) {
		if (message.charAt(i) != ' ')
		System.out.print(String.valueOf(message.charAt(i)));
		}
		System.out.println();
		System.out.println("--------------------------------");
	}
	
	public static void inspectToArray(String message) {
		char[] chars = new char[message.length()]; 
		for (int i = 0; i < chars.length; i++) {
			chars[i] = message.charAt(i);
		}
		System.out.println("Length: " + chars.length);
		for (int i = 0; i < chars.length; i++)
		System.out.print("Chars: " + chars[i] + " - ");
	}
	
	public void changeCharAt(String message, String newMessage, int start, int end) {
		StringBuilder sb = new StringBuilder(message); //Use methods of the StringBuilder class
		sb.replace(start, end, newMessage);
	}
	
	public Char getCharAt(String message, int index) {
		try {
			return message.get(index);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Please try again, the index is not within boundaries" + e.getMessage());
		}
	}
	/*PSI 3 Requirement
	  These three classes allow us to print out the date and the current time
	*/
	public void getTime() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
	}

}
