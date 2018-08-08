package bitcounting;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BitCouting {
    /*
    * Get number from key board
    * Count number of bit 1 in bit string from given number
    * Ex: 121231234 -> number of bit 1 is 15
    */
    private static int bitCount(int n){
        //Do something here
        return 0;
    }
    
    
    //Get number from key board
    private static int getNumber(){
        Scanner scanner=new Scanner(System.in);
        int number;
        while(true){
            try{
                number=Integer.parseInt(scanner.nextLine());
                return number;
            }catch(NumberFormatException e){
                System.out.println("Invalid year!");
            }
        } 
    }
    
    public static void main(String[] args) {
        //Do some thing here
    }
}
