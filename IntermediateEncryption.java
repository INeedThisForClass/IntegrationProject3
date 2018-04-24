package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IntermediateEncryption extends Encryption implements FileEncryption {

	/*PSI 3 Requirement
	 * This interface shows the idea of polymorphism as it loads the methods it contains
	 * and they are define here in this class. The file will be loaded and then the message
	 * written in the file will be stored in the message variable.
	 */
	public static File currentFile;
	public static String message;
	
	public void loadFile(String path) {
		currentFile = new File(path);
	}

	/*PSI 3 Requirement
	 * In this method we attempt to create an object out of a file, however,
	 * if the file is not found the method catches a FileNotFoundException.
	 * The case of the IOException is the same scenario.
	 */
	public void getMessageFromFile(File file) {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String message = "";
		try {
			while((message = br.readLine()) != null ) {
				System.out.println(message);
				IntermediateEncryption.message = message;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
