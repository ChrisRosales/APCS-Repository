/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silen
 */
import java.util.Scanner;

public class RoachMain {

    Scanner input = new Scanner(System.in);
    double population;
    RoachPopulation roach = new RoachPopulation(population);

    public RoachMain() {
        System.out.println("Enter in an initial population");
        double initial = input.nextInt();
        population = initial;
        roach.add(population);
        menu();
    }

    public static void main(String[] args) {
        RoachMain es = new RoachMain();

    }

    public void menu() {

        while (true) {

            System.out.println("--------------------");
            System.out.println("Current Population: " + roach.getRoaches());
            System.out.println("--------------------");
            System.out.println(roach.toString());
            System.out.println("--------------------");
            System.out.println("1 = Wait (doubles pop)");
            System.out.println("2 = Spray(attemps to kill)");
            System.out.println("3 = Exit");
            System.out.println("--------------------");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    waitDouble();
                    break;
                case 2:
                    spray();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public void waitDouble() {
        roach.waitTime();
        menu();
    }

    public void spray() {
        roach.percentChange();
        int percentage = input.nextInt();
        roach.spray(percentage);
        
        menu();
    }
}
