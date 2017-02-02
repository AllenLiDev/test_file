package changeFileName;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class HashTest implements getIt {
	private String searchFile;
	
	HashTest(String filename) throws IOException{
		System.out.println("Hashtest created");
		searchFile = filename;
	}

	public void getMap() throws IOException{
		try{
			String fileName = "config.properties";
			
			InputStream iStream = HashTest.class.getResourceAsStream(fileName);
			
			if(iStream != null){
				getIt.temp.load(iStream);
			} else {
				throw new FileNotFoundException("property file not found");
			}
			
			String test = getIt.temp.getProperty(searchFile);
			System.out.println(test);
		} catch (Exception e){
			System.out.println("derped " + e.getMessage());
		}
		return;
	}
	
	
}
