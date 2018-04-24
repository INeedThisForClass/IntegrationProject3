package integrationproject;

public class BasicEncryption extends Encryption {
	/*PSI 3 Requirement
	  BasicEncryption and Encryption represents a class hierarchy since Encryption is the building block of every encryption
	  BasicEncryption represents a form of encryption, which is all possible because BasicEncryption extends Encryption.*/

	private boolean debug  = false;
	//Overloaded constructors 
	public BasicEncryption() {
		
	}
	public BasicEncryption(boolean debug) {
		this.debug = debug;
	}
	/*PSI 3 Requirement
	  The two methods below are overriden from the superclass (Encryption)
	  Polymorphism because this class (BasicEncryption) 'is a' form of Encryption. This allows us to perform the same action
	  (Encrypt/Decrypt) in a different way, for instance if we had another version of an Encryption class, it could also use
	  these method to encrypt/decrypt in its own way*/
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
