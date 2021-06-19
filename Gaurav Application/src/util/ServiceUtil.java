  
package util;

import java.util.Scanner;
// Side Class 

public class ServiceUtil {
      public static String enterNameandSurname(String Title) {
    	   System.out.println(Title);
    	   @SuppressWarnings("resource")
		   Scanner scanner =new Scanner(System.in);
    	   String answer= scanner.nextLine();
    	   return answer;
      }
      public static String entry() {//   For code reusability
    	  String name= enterNameandSurname("Enter your name and surname");
          String email= enterNameandSurname("Enter your email");
          String phone=enterNameandSurname("Enter your phone number");
          return "Name :"+name.toUpperCase()+",Email :"+email.toLowerCase()+",Phone number :"+phone;  
      }
      public static int enterinteger(String Title) {
    	  System.out.println(Title);
    	  @SuppressWarnings("resource")
		Scanner scanner =new Scanner (System.in);
    	  int answer =scanner.nextInt();
    	  return answer;
      }
      public static String enterUser()  {
    	  while(true) {
    	  String location=enterNameandSurname("Where is your current location ?");
    	  String time=enterNameandSurname("Enter the time you want to travel :(Format: day-month-Year)");
    	  int passanger = enterinteger("How many passangers are there?");
    	  String requires=enterNameandSurname("Please give the information about your shareable information\t For eg: Smoking- Yes, Luggage-Yes, Pets-No");
    	  return "You want to travel from "+location.toUpperCase()+" at "+ time.toUpperCase()+"with "+passanger+" nos. of passenger with following requires\n: "+requires.toUpperCase();
      }
      }
}