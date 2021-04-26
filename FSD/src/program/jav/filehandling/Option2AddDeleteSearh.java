package program.jav.filehandling;

import java.io.File;
import java.io.IOException;

	        
public class Option2AddDeleteSearh {
	public static void main(String[] args) {
		   try {  
	           //-------------create a new file in the directory---------------//
			   File myObj = new File("C:\\Users\\hocki\\OneDrive\\CALTECH Full Stack Web Development\\Java\\Coursework Sample Files\\Create-New-File.txt");
			   
			   if (myObj.createNewFile()) {
				   System.out.println("File created: " + myObj.getName());
				
			   } else {
				   System.out.println("File already exists");
			   }
			
			   
			   
			   
			   //-------------delete a new file in the directory---------------//
			   File myObj2 = new File ("C:\\Users\\hocki\\OneDrive\\CALTECH Full Stack Web Development\\Java\\Coursework Sample Files\\deletecasesensitive.txt");
			   
			   boolean b = myObj2.delete();
               if(b==true)
               {
               	System.out.println("File deleted !!");
               }
               else
               {
               	System.out.println("File not deleted");
               }
               
			   
			   
			   //--------------Search a user specified file from the main directory---------//
			   File file = new File("C:\\Users\\hocki\\OneDrive\\CALTECH Full Stack Web Development\\Java\\Coursework Sample Files\\user-specified-file.txt");  // this is used to create the file
	        
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())//---check if the new file exist---//
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());
	                    System.out.println("File class:  " + file.getClass());
	                    System.out.println("File parent:  " + file.getParent());  //give the parent folder name
	                    System.out.println("File space allocated:  " + file.getUsableSpace());
	                    System.out.println("File length: " + file.length());
	                    System.out.println("File list:   " + file.list());	                    
	                }
	                                

	          
	                
	                file = new File("C://Users//hocki//OneDrive//Career//2020 Job Application//user-specified-file.txt" );
	                
	                //------------end of the above code--------------------//
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	  
	   }
}
