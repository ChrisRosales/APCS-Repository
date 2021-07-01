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

public class Tester {
    public Tester() {
        tester();
    }

    public static void main(String[] args) {
        Tester c = new Tester();
    }

    public void tester() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter in a phrase, q to break");
            String word = input.nextLine();
            if (word.equals("q")) {
                break;
            }
            boolean result = cooneyLikes(word);
            if (result == true) {
                System.out.println("Cooney Likes " + word);
            } else {
                System.out.println("Cooney does not like " + word);
            }
        }
    }

    public boolean cooneyLikes(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i + 1).equals(word.substring(i + 1, i + 2))
                    && !word.substring(i, i + 1).equals("  ")) {
                return true;
            }
        }
        return false;
    }
}
