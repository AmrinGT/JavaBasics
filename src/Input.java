import java.util.Scanner;

public class Input {
	
	
		  public static void main(String[] args) {
			  
			  System.out.println("THIS PROGRAM WILL COMPUTE ALL THE RULES in the form A ---> B.");	
		        System.out.println("Please chose the threshold computation method:");
		        
		        System.out.println("Enter 1 for #(A, B) / #A");
		        System.out.println("Enter 2 for (#(A, B) / #A) / #transactions ");
		        System.out.println("Enter E to exit");
		       
			  
		    Scanner myObj = new Scanner(System.in);  
		    System.out.println("Please chose the threshold computation method:");

		    String entry = myObj.nextLine();  
		    System.out.println("You have chosen: " + entry); 
		    
		  }
		}

	