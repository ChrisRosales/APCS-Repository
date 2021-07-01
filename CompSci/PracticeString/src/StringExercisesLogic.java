
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *      FILE:       StringExercisesLogic.java
 *      DATE:       Nov 21, 2019
 *      VERSION:    1.0
 *      AUTHOR:     mr Hanley
 *      PURPOSE:    Practice for Students doing String methods
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringExercisesLogic {

    private String theText = "";
    private final char borderChar = '\u2592';
    Scanner input = new Scanner(System.in);

    public void loadText(String filename) {
        try {
            FileReader fr = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fr);

            //Read the first line of the file
            String line = br.readLine();
            while (line != null) {
                theText += line + "\n";
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringExercisesLogic.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(StringExercisesLogic.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println(" FILE LOADED");

    }

    public StringExercisesLogic() {
        loadText("bartleby.txt");
        menu();
    }

    public void drawBar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(borderChar);
        }
        System.out.println("");
    }

    public void menu() {
        while (true) {
            drawBar(50);
            System.out.println("1 = Display Text");
            System.out.println("2 = Count Length");
            System.out.println("3 = Search for Phrase");
            System.out.println("4 = Find # Occurences");
            System.out.println("5 = Replace spaces with other char");
            System.out.println("6 = Reverse the text");
            System.out.println("7 = Take a substring of the text");
            System.out.println("8 = Type in a new String");
            System.out.println("0 = Exit");
            drawBar(50);
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println(theText);
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    findLength();
                    break;
                case 3:
                    System.out.println("Search for phrase:");
                    input.skip("\n");
                    String phrase = input.nextLine();
                    findPhrase(phrase);
                    break;
                case 4:
                    System.out.println("Find # occurrences for phrase:");
                    input.skip("\n");
                    String phrase2 = input.nextLine();
                    countOccurences(phrase2);
                    break;
                case 5:
                    System.out.println("Replace Spaces with what letter");
                    String letter = input.next();
                    replaceSpaces(letter);
                    break;
                case 6:
                    System.out.println("I will reverse the text");

                    reverse();
                    break;
                case 7:
                    System.out.println("Give me a couple of numbers and I'll give you substring");
                    System.out.println("start->");
                    int start = input.nextInt();
                    System.out.println("end->");
                    int end = input.nextInt();
                    printsub(start, end);
                    break;
                    case 8:
                    System.out.println("Please type in a phrase and I'll over-write");

                    input.skip("\n");
                    getNewText();
                    break;
            }
        }
    }

    //postcondition: Prints out the number of characters in theText
    public void findLength() {
        System.out.println(theText.length());
    }

    //postcondition: prints out the first location of str, -1 if not found!! 
    public void findPhrase(String str) {
        System.out.println(theText.indexOf(str));
    }

    //postcondition: prints out the numnber of str
    public void countOccurences(String str) {
        int count = 0;
        for (int i = 0; i < theText.length(); i++) {
            if (theText.substring(i, i + str.length()).equals(str) == true) {
                count++;
            } 
        }
        System.out.println(count);
    }

    //postcondition: all spaces replaced with specified char
    public void replaceSpaces(String ch) {
           theText = theText.replaceAll(" ", ch);
    }

    //postcondition: theText is reversed
    public void reverse() {
        String reversedText = "";
        for(int i = theText.length() - 1; i >= 0; i--) {
            reversedText += (theText.substring(i, i+1));
            //reversedText += theText.charAt(i);
        }
        theText = reversedText;
    }

    //postcondition: prints a substring of existing string
    public void printsub(int st, int en) {
        System.out.println(theText.substring(st, en));
    }

    //postcondition: over-writes theText with 
    public void getNewText() {
        theText = input.nextLine();
    }

}
