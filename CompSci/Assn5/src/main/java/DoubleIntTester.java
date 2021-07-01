
/**
 * ---------------------------------------------------------------------------
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ---------------------------------------------------------------------------
 * FILE: Assign5Tester_OLD.java
 *
 * DATE:  Nov 3, 2017
 *
 * PURPOSE: Test the BoxPrint and Verifiers
 *          Show students the version of DoubleVerifier without
 *
 * @author mr Hanley
 * @version 1.0
 * ---------------------------------------------------------------------------
 *
 * h-a-n-l-e-y.c-o-.-n-r------t-e-a-m-2-0-.-c-o-m-----------------------------
 */
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class DoubleIntTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Global Sound Clips
        Clip bombSnd = null;//Clips to be played

        //Prepare an Audio File for the Verifiers, let's use the bomb sound
        //Load up bomb sound file
        File bombSndF = new File("sounds/Explosion.wav");

        try {
            bombSnd = AudioSystem.getClip();
            bombSnd.open(AudioSystem.getAudioInputStream(bombSndF));
        } catch (Exception e) {
            System.out.println(e);
        }

        //Create the 8 verifiers
        IntVerifier intVer1 = new IntVerifier(input, 1, true, 10, true, bombSnd);
        IntVerifier intVer2 = new IntVerifier(input, -3, false, 10, true, bombSnd);
        IntVerifier intVer3 = new IntVerifier(input, 0, true, 10, false, bombSnd);
        IntVerifier intVer4 = new IntVerifier(input, 1, false, 100, false, bombSnd);

        DoubleVerifier dlbVer1 = new DoubleVerifier(input, 0, true, .1, true, bombSnd);
        DoubleVerifier dlbVer2 = new DoubleVerifier(input, 0, false, .1, true, bombSnd);
        DoubleVerifier dlbVer3 = new DoubleVerifier(input, 0, true, 1.7, false, bombSnd);
        DoubleVerifier dlbVer4 = new DoubleVerifier(input, -1.6, false, 198.2, false, bombSnd);

        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Welcome to Assign 5 Tester");
            System.out.println("1 = Print Square Roots 1-100");
            System.out.println("2 = BoxPrint a Phrase");
            System.out.println("3 = Test Int Ver L inc H inc");
            System.out.println("4 = Test Int Ver L exc H inc");
            System.out.println("5 = Test Int Ver L inc H exc");
            System.out.println("6 = Test Int Ver L exc H exc");
            System.out.println("7 = Test Dbl Ver L inc H inc");
            System.out.println("8 = Test Dbl Ver L exc H inc");
            System.out.println("9 = Test Dbl Ver L inc H exc");
            System.out.println("10 = Test Dbl Ver L exc H exc");
            System.out.println("0 = I'm out");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    CWHUtilities.outputSqareRoots();
                    break;
                case 2:
                    System.out.println("Please enter in a phrase to be box printed");
                    input.skip("\n");
                    String phrase = input.nextLine();
                    CWHUtilities.outputBoxStr(phrase);
                    break;
                case 3:
                    System.out.println("Please type in # between 1 (inc) and 10 (inc)");
                    int intValue = intVer1.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 4:
                    System.out.println("Please type in # between 1 (exc) and 10 (inc)");
                    intValue = intVer2.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 5:
                    System.out.println("Please type in Int Ver L inc H exc");
                    intValue = intVer3.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 6:
                    System.out.println("Please type in Test Int Ver L exc H exc");
                    intValue = intVer4.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 7:
                    System.out.println("Please type in Test Dbl Ver L inc H inc");
                    double dblVal = dlbVer1.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 8:
                    System.out.println("Please type in Test Dbl Ver L exc H inc");
                    dblVal = dlbVer2.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 9:
                    System.out.println("Please type in Test Dbl Ver L inc H exc");
                    dblVal = dlbVer3.readAndVerify();
                    System.out.println("GOLDEN");
                    break;
                case 10:
                    System.out.println("Please type in Test Dbl Ver L exc H exc");
                    dblVal = dlbVer4.readAndVerify();
                    System.out.println("GOLDEN");
                    break;

                case 0:
                    break;
            }

        }
    }
}
