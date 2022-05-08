import java.util.*;
import java.io.*;

public class TestAccount
{
	public static void displayMenu(){
			System.out.println("------------------------------------------");
			System.out.println(" Covid-19 Highway Application System");
			System.out.println("------------------------------------------");
			System.out.println("[1] Applicant");
			System.out.println("[2] Police");
			System.out.println("[3] Exit");
			System.out.print("Your choice: ");
	}

    public static void main(String args[]){

		int choice;
		int choice1;
		int choice2;

    	Applicant a = new Applicant("ID001", "Aswind", 2 , "NONE");
    	Applicant b = new Applicant("ID002", "Varman", 4 , "Insufficient Documents");

    	Destination d1 = new Destination("Negeri Sembilan", "Johor");
    	Destination d2 = new Destination("Kuala Lumpur", "Melaka");

    	HealthDeclaration h1 = new HealthDeclaration(001, "Aswind");
    	HealthDeclaration h2 = new HealthDeclaration(002, "Varman");

    	Form f1 = new Form(d1, h1, "Application for Studies", "000302-04-2032", "PASS");
     	Form f2 = new Form(d2, h2, "Application for Business", "710416-02-1056", "FAIL");

		a.create(f1);
     	b.create(f2);

		while(choice != 3){
			displayMenu();
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();

			switch(choice){
				case 1:
				System.out.println("\nHello Applicant. Please enter your username and password.");
				System.out.print("Username: ");
				String username = input.nextLine();
				System.out.print("Password: ");
				String password = input.nextLine();

				System.out.println("Processing ... ... ...");
				System.out.println();

				System.out.println("\nWhich option do you want to choose?");
				System.out.println("[1] View Your Details");
				System.out.println("[2] View Fine Details");
				System.out.println("[3] Exit to Main Menu");
				System.out.print("Your choice: ");
				choice1 = input.nextInt();

				switch(choice1){
					case 1:
					a.display();
					break;

					case 2:

				}

    			break;

    			case 2:
				System.out.println("\nHello Police. Please enter your username and password.");
				System.out.print("Username: ");
				String username = input.nextLine();
				System.out.print("Password: ");
				String password = input.nextLine();

				System.out.println("Processing ... ... ...");
				System.out.println();

				System.out.println("\nWhich option do you want to choose?");
				System.out.println("[1] Office");
				System.out.println("[2] Highway");
				System.out.println("[3] Exit to Main Menu");
				System.out.print("Your choice: ");
				choice2 = input.nextInt();

					switch(choice2){
						case 1:
						break;

						case 2:
						break;
					}

    			break;

    			case 3:
				System.out.println();
				System.out.println("Thank you for using this system :)");
		 	 	break;
			}
    	}
  		}
}

