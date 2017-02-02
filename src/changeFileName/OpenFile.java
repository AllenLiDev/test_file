package changeFileName;

import java.io.File;

public class OpenFile {
	private static final String FILE_TYPE = ".pdf";
	
	File dir;
	ChangeFilename changer;
	
	OpenFile(String location){
		System.out.println("openfile created");
		changer = new ChangeFilename();
		dir = new File(location);
	}
	
	public void ChangeFileName(){
		System.out.println("changefilename called");
		if(dir.isDirectory()){
			for(final File f: dir.listFiles()){
				try{
					
					File replace = new File("C:/Users/allli/Desktop/test/" + changer.changeIt(f.getName()) + FILE_TYPE);
					
					if(f.renameTo(replace)){
						System.out.println("success!");
					} else {
						System.out.println("fail");
					}
				}
				catch (Exception ex){
					ex.printStackTrace();
				}
			}
		}
	}
	
}
