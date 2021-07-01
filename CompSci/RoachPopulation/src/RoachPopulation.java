/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silen
 */
public class RoachPopulation {
//Instance Variables

    int count, rangeMin = 10, rangeMax = 50;
    double spray, roachPopulation;

//Constructors
    public RoachPopulation(double population) {
        roachPopulation = population;
    }
//Accessors

    public double getRoaches() {
        return roachPopulation;
    }

//Mutators
    public void waitTime() {
        roachPopulation *= 2;
    }
    public void percentChange(){
        System.out.println("Enter in a percentage Minimum of " + rangeMin + " and Maximum of " + rangeMax);
    }
    public void spray(double percentage) {
        
        spray = percentage;
        if (count == 0 && spray >= rangeMin && spray <= rangeMax) {
            double originalVal = roachPopulation;
            spray /= 100;
            spray = Math.abs(spray-1);
            roachPopulation *= spray;
            roachPopulation = (int) Math.round(roachPopulation);
            rangeMin -= 2;
            rangeMax -= 2;
            System.out.println("You have killed " + (originalVal - roachPopulation) + " roaches");
        } else {
            System.out.println("Sorry that input was OOB!");
        }
    }

    public void add(double num) {
        roachPopulation += num;
    }

    @Override
    public String toString() {
        String output = "\n";
        for (int i = 1; i < roachPopulation + 1; i++) {
            output += "@";
            if (i % 20 == 0 && i >= 20) {
                output += "\n";
            }
            if (i % 100 == 0 && roachPopulation > 100 && i != 0) {
                output += "--------------------\n";
            }
        }
        return output;
    }
}
