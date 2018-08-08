package leapyear;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeapYear {
    
    /*
    * Get year from key board
    * check if given year is leap year or not
    * if it is leap year print out "Leap year"
    * else print out "Not a leap year"
    */
    
    
    private static boolean checkLeapYear(int year){
        //Do some thing here
        return false;
    }
    
    //Get year from key board
    private static int getYear(){
        Scanner scanner=new Scanner(System.in);
        int year;
        while(true){
            try{
                year=Integer.parseInt(scanner.nextLine());
                return year;
            }catch(NumberFormatException e){
                System.out.println("Invalid year!");
            }
        } 
    }
    
    public static void main(String[] args) {
        //Do some thing here
    }
}
