package changeFileName;

import java.io.IOException;

public class Driver {
	/**
	 * Drives the program
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Starting test");

		ChangeFilename test = new ChangeFilename();
		HashTest test2 = new HashTest("BA06");
		OpenFile test3 = new OpenFile("C:/Users/allli/Desktop/test");
		
		test3.ChangeFileName();
		
		test2.getMap();
		
		System.out.println(test.changeIt("CA0010001_Canada_20160730_EONLY_92785599_303.pdf"));

		System.out.println("test ending");
	}
}
