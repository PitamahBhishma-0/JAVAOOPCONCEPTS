package main;
import java.util.Scanner;
import servicemenu.Service;
import util.ServiceUtil;
public class Main  {
	public static void main(String[] args) throws Exception {
		System.out.println("    WELCOME TO GAURAV CAR SERVICE\n\tYOUR RIDE, YOUR CHOICE");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        String services ="1: Find Ride\n"+
		                  "2: Give ride\n"+
        		          "3: About us\n"  
		                  +"0: Quit";
        String nationality=ServiceUtil.enterNameandSurname("Tell us if you are Foriegn or Local :");
       
        while(true) {
        if(nationality.equalsIgnoreCase("foriegn")) {
        	//String passport="";
        	String passport=ServiceUtil.enterNameandSurname("Please enter your PassportId :");
        	System.out.println("Checking for Passport  :"+passport+".....");
        	Thread.sleep(1500);
        	System.out.println("Checking completed");
        	
        }
        else if(nationality.equalsIgnoreCase("Local")) {
        	  
        }
        else {
        	System.out.println("Please enter the correct command"+"\nLocal or Foriegn");
        	break;
        }
        System.out.println(services);
        System.out.println("Select a digit that u want to perform :");
        int menu=scanner.nextInt();
        if(menu==1) {
        	Service.menu1();
        	break;
        }
        else if(menu==2) {
        	Service.menu2();
        	break;
        }
        else if(menu==3) {
        	System.out.println("Know about us");
        	break;
        }
        else if(menu==0) {
        	System.out.println("Exiting from system");
        	break;
        	
        }
        else {
        	System.out.println("Invalid command");
        	System.out.println("Please read the command above to perform in the application");
        	break;
        	
        }
      }
	
	}

}