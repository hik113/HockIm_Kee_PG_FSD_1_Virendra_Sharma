package program.jav.filehandling;
import java.util.Scanner;

public class AccountPassw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String h = null; 
		AccountPassw obj = new AccountPassw();
	
		//Take user Option from the below mentioned Menu
		Scanner input = new Scanner(System.in);
		System.out.println("****************************************************************");
		System.out.println("*********************  LOCKED ME. COM  ********************");
		System.out.println("****************************************************************");
		System.out.println();
		
		System.out.println(" 1. New User - Register");
		System.out.println(" 2. Already User - Login");
		System.out.println();
		
		System.out.println("Enter Your Choice:");
		num = input.nextInt();   
		 
		   switch(num){    
		   case 1: System.out.println("Register"); 
		           obj.userInput_Reg(); 
		           break;  
		   case 2: System.out.println("Login");  
		           h = obj.readFromFile_Login();
		           
	}

}

	private String readFromFile_Login() {
		// TODO Auto-generated method stub
		return null;
	}

	private void userInput_Reg() {
		// TODO Auto-generated method stub
		
	}
}

