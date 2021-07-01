package bouncecalculator;

/**
 *
 * @author ChrisRosales
 */
import java.util.Scanner;

public class Bouncecalculator {

  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //input
        System.out.println("What height to start?"); //starting drop height
        double startingHeight = input.nextDouble();
        System.out.println("Index of bounce?");//bounce index
        double bounceindex = input.nextDouble();
        System.out.println("How many bounces?"); //total number of bounces
        int bounces = input.nextInt();
        double currentHeight = startingHeight; //current height = next height after bounce index
        double totaldistance = 0; //starting point
        int i = 0; //# of bounces
        
        //while loop
        while(i < bounces){
            System.out.println("Down: "+ currentHeight); //down first then up
            totaldistance = currentHeight + totaldistance; //add next height after index and the distance
            currentHeight = currentHeight * bounceindex; //add to current height because it there will be multiple bounces
            System.out.println("Up: " + currentHeight); //after up we go down
            totaldistance = currentHeight + totaldistance;
            if(currentHeight < .001){
                System.out.println("less than 0.001");
                System.out.println("last bounce was" + (i+1));
            }
            i++;
        }
        System.out.println("Total distance traveled was "+ totaldistance); //end all be all answer
    }
    
}
