//CodeAlpha
//@CodeAlpha

//Task-3

//Travel Itinerary Planner

import java.util.*;
public class Task_3 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Destinattion");
    String destination=sc.nextLine();

    System.out.print("Enter travel dates:");
    String tdates=sc.nextLine();

    char option='\0';
    System.out.println("B.Budget");
    System.out.println("W.Weather");
    System.out.println("M.Map");

    System.out.println("A.All three of Them");
    System.out.println("Enter your choice:");
    
    option=sc.nextLine().toUpperCase().charAt(0);

    System.out.println("Generating travel plan for "+destination+" from "+tdates);

    switch(option){

        case 'B':
            System.out.println("=====================================================================");

            System.out.println("Calculating budget for the trip to"+destination);

            System.out.println("Your Budget will be around :"+Math.random()*5939);

            System.out.println("===================================================================================");
            break;
        case 'M':
            System.out.println("***********************************************************************");
            System.out.println("Fetching maps for "+destination);

            System.out.println("your Distance will be approx:"+Math.random()*10000+"KM");

            System.out.println("***************************************************************************");

            break;
        case 'W':
            System.out.println("===============================================================");

            System.out.println("Fetching weather information for "+destination);

            System.out.println("Your weather will be:Cold");

            System.out.println("***********************************************************************");
            break;
        case 'A':
            System.out.println("*************************************************************************");

            System.out.println("Calculating budget for the trip to "+destination+"**********************");

            System.out.println("Your budget will be around:"+Math.random()*5939393+"RS");

            System.out.println("Fetching weaaather information for "+destination+"********************");

            System.out.println("Your weather will be:Cold");

            System.out.println("Fetching maps for"+destination+"**********************************");

            System.out.println("Your Distance will be approx:"+Math.random()*10000+"KM");

            System.out.println("***************************************************************************");
            break;
        default:
            break;
    }

    System.out.println("********Travel Plan**************");

    System.out.println("Destination:"+destination);

    System.out.println("Travel Dates:"+tdates);

    System.out.println("Happy journey Thanks for using our services..");

    System.out.println("***************END*************");

    sc.close();

}
    }
    

