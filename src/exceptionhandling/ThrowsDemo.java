package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\roman\\OneDrive\\Desktop");
		
	}
	
	void saveFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\roman\\OneDrive\\Desktop");
		
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readFile();
			rw.saveFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		

	}

}
