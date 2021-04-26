package program.jav.filehandling;
import java.io.File; 



public class Option1RetrieveFiles {
	
	
	public static void main(String[] args) {
		
		//create a folder path
		String folderPath = "C:\\Users\\hocki\\OneDrive\\Career\\2020 Job Application";
		
		
		File folder = new File(folderPath);
		File [] FileDocuments = folder.listFiles();
		
		
		for(File file:FileDocuments)
			
			if (file.isFile()) {
				System.out.println("File ->"+file.getName());
			}
			else
				if (file.isDirectory()) {
					System.out.println("Folder ->" + file.getName());
			}
		
	}
	

}
