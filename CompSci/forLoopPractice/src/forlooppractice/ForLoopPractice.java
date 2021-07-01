/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlooppractice;

/**
 *
 * @author silen
 */
public class ForLoopPractice {

    /**
     * @param args the command line arguments
     */
    public String pascalsTri(int levels) {
        int rows = 0;
        for (int i = 0; i < levels; i++) {
            //handling number of rows
            for (int j = 0; i < levels; i++) { // going up first--counting tabs (spaces)
                System.out.println("\t");//printing tabs (spaces)

            }
            System.out.println("");
            rows++;
        }
        for (int i = 0; i < rows; i++) {//printing the triangle
            System.out.print("1");
        }
        return "";
    }
}

}
