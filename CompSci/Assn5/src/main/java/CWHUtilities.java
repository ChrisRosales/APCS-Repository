
/*
Chris Rosales
APCS
Period 5
Mr. Hanley
Assignment 5
CRUtilities
*/

import java.lang.*;
import java.util.Scanner;

public class CWHUtilities {

    public static void main(String[] args) {
        
    }

    public static void outputSqareRoots() {
        int start = 0;
        while (start <= 1000) {
            System.out.println(start + "\t" + Math.sqrt(start));
            start++;
        }
    }

    public static void outputBoxStr(String message) {
        if (message.length() > 20) {
        message = message.substring(0, 20);
        }
        //Scanner character = new Scanner(System.in);
        int characterLength = message.length();
        for (int i = 0; i < characterLength + 6; i++) {
            System.out.print("@");
        }
        System.out.println("");
        System.out.print("@@");
        for (int i = 0; i < characterLength + 2; i++) {
            System.out.print(" ");
        }
        System.out.print("@@");
        System.out.println("");
        System.out.print("@@ ");
        System.out.print(message);
        System.out.print(" @@");
        System.out.println("");
        System.out.print("@@");
        for (int i = 0; i < characterLength + 2; i++) {
            System.out.print(" ");
        }
        System.out.print("@@");
        System.out.println("");
        for (int i = 0; i < characterLength + 6; i++) {
            System.out.print("@");
        }


    }
}
