package jumping;

/**
 *
 * @author Admin
 */
public class Jumping {
   
    /*
    *Number passed is always Positive .
    *Return the result as String .
    *The difference between ‘9’ and ‘0’ is not considered as 1 .
    *All single digit numbers are considered as Jumping numbers.
    */
    
    public static String jumpingNumber(int number){
        //Do some thing here
        return null;
    }
    
    /*
    * Expect output should like
    *    Jumping!!
    *    Not!!
    *    Jumping!!
    *    Not!!
    *    Jumping!!
     *   Jumping!!
    */
    public static void main(String[] args) {
        System.out.println(jumpingNumber(9));
        System.out.println(jumpingNumber(79));
        System.out.println(jumpingNumber(23));
        System.out.println(jumpingNumber(556847));
        System.out.println(jumpingNumber(4343456));
        System.out.println(jumpingNumber(98789876));
    }
}
