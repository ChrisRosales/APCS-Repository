package perfectnumber;

/**
 *
 * @author ChrisRosales
 */
import java.util.Scanner;//for the input

public class Perfectnumber {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        
        if(divisorSum(number) == number){
            System.out.println("Perfect number"); //nteger is equal to the sum of its divisors
        }
        if(divisorSum(number) > number){
            System.out.println("Abundant number"); //Sum of divisors is less than the number
        }
        if(divisorSum(number) < number){
            System.out.println("Deficient number"); //Sum exceeds number
        }
    }
    //Loops through possible candidates
    public static int divisorSum(int num) {
        int divisorSum = 0;
       int div = 1;
       while (div < num){
       if(isDivisor(num, div)){
           divisorSum += div;
       }
                  div++;

    }
              return divisorSum;

    }
    //returns true or false depending upon the relationship
    public static boolean isDivisor(int num, int divisor) {
     if (num % divisor == 0) {
            return true;
        } else {
            return false;
}   
    }
}

