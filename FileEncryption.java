package main;

import java.io.File;

public interface FileEncryption {

	public void loadFile(String path);
	public void overwriteFile(File file);
	public void encryptFromFile();
	public void decryptFromFile();
	
}
