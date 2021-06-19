  
package servicemenu;

import java.util.LinkedList;
import main.Cities;
import util.ServiceUtil;

public class Service extends Thread {
         public static void menu1() throws InterruptedException {
        	 String info=ServiceUtil.entry();
         	System.out.println(info);
         	System.out.println("___________________________________________________________");
         	String travel=ServiceUtil.enterNameandSurname("Where Do You Want To Go?");
         	String city=travel.toUpperCase();
         	System.out.println("Checking destinations for "+city);
         	Thread.sleep(1200);
         	Cities city1=new Cities();
         	LinkedList<String> citycall=city1.getlist();
         	if(citycall.contains(city)){
         		System.out.println("There is a service available at"+city);
         		System.out.println("Welcome ....");
         		String helloUser=ServiceUtil.enterUser();
         		System.out.println(helloUser);
         		
         	}
         	else {
         		System.out.println("There is no service available at "+city+" for now\n Here available city are");
         		Cities cities2=new Cities();
         		LinkedList<String> cities1=cities2.getlist();
         		for(String s:cities1) {
         			System.out.println(s);
         		}
         	}
         }
         public static void menu2() {
        	 String info = ServiceUtil.entry();
         	System.out.println(info);
         	String toPlace=ServiceUtil.enterNameandSurname("Where do u want to ride?");
         	String fromPlace=ServiceUtil.enterNameandSurname("Where are you from?");
         	String carType=ServiceUtil.enterNameandSurname("Your car type: ");
         	int noPassanger=ServiceUtil.enterinteger("What is the capacity you can carry ?");
         	String requires=ServiceUtil.enterNameandSurname("Please give the information about your costumer can have \t For eg: Smoking- Yes, Luggage-Yes, CarType- SUV, Pets-No");
         	System.out.println("Travelling to"+toPlace.toUpperCase()+" from "+fromPlace.toUpperCase()+"in Cartype"+carType.toUpperCase()+" with "+noPassanger+"passanger"+"having following requirements"+requires.toUpperCase()); 
         }
}