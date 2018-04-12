package integrationproject;

public class BasicEncryption extends Encryption {

	private boolean debug  = false;
	//Overloaded constructors 
	public BasicEncryption() {
		
	}
	public BasicEncryption(boolean debug) {
		this.debug = debug;
	}
	//This method is overriden from the superclass (Encryption)
	//Polymorphism
	@Override
	public String encrypt(String message) {
		String encryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			char current = message.charAt(i);
			if (current != ' ')
				current += (char)key;
			encryptedMessage += current;
		}
		if (debug)inspectToArray(encryptedMessage);
		return encryptedMessage;
	}
	//This method is also overriden from the superclass (Encryption)
	//Polymorphism
	@Override
	public String decrypt(String message) {
		String decryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			char current = message.charAt(i);
			if (current != ' ') current -= (char)key;
			decryptedMessage += current;
		}
		if (debug)inspectToArray(decryptedMessage);
		return decryptedMessage;
	}
	

	public void setDebug(boolean debug) {
		this.debug = debug;
		if (debug)System.out.println("debug mode has been enabled!");
		else System.out.println("debug mode has been disabled!");
	}

	public boolean getDebug() {
		return debug;
	}
}
