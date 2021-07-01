package triangle;

/**
 *
 * @author ChrisRosales
 */
import java.util.Scanner; //for the input
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of side 1");
        int a = input.nextInt();
        System.out.println("what is the length of side 2");
        int b = input.nextInt();
        System.out.println("what is the length of side 3");
        int c = input.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("This is not a Triangle");//Self explanatory.. Had to put it first just incase someone tried to beat the system
        } else {
            System.out.println("This is a Triangle"); //Justifying if its a triangle first off

            if (a != b && b != c && a != c) {
                System.out.println("Scalene"); //All integers are not equal to each other
            } else if (a == b && b == c) {
                System.out.println("Equilateral");//All integers are equal to each other
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");//Two or more integers are equal to each other
            }
        }
    }
}
