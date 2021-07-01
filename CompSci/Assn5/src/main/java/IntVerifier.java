/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.lang.*;
import java.util.InputMismatchException;
import javax.sound.sampled.Clip;

public class IntVerifier {

    private Scanner keyboard;
    private int low, high;
    private boolean highInc, lowInc;
    private Clip errorSnd;

    public IntVerifier(Scanner sc, int lo, boolean loInc, int hi, boolean hiInc, Clip eSnd) {
        keyboard = sc;
        low = lo;
        high = hi;
        highInc = hiInc;
        lowInc = loInc;
        errorSnd = eSnd;

    }

    public int readAndVerify() {
        //Reads in a value using the Global Scanner variable provided to the
        //Constructor
        //If the value is out of range, plays the Clip error sound and prompts for input again until in range
        while (true) {
            int inVal = 0;
            try {
                inVal = keyboard.nextInt();
                if (highInc && lowInc) {
                    if (inVal <= high && inVal >= low) {
                        return inVal;
                    }
                }
                if (lowInc && !highInc) {
                    if (inVal >= low && inVal < high) {
                        return inVal;
                    }
                }
                if (!lowInc && highInc) {
                    if (inVal < low && inVal >= high) {
                        return inVal;
                    }
                }
                if (!highInc && !lowInc) {
                    if (inVal < high && inVal > low) {
                        return inVal;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@");
                System.out.println(" Bad Character");
                System.out.println("@@@@@@@@@@@@@@@@@@@@");
                System.out.println("");
                errorSnd.setFramePosition(0);
                errorSnd.start();
            } finally {
                keyboard.nextLine();
            }
        }
    }
}
