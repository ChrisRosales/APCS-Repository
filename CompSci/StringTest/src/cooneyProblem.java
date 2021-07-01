/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silen
 */

public class cooneyProblem {
    public boolean cooneyLikes(String word) {
        for (int i = 0; i < word.length() - 1; i++) 
            if(word.substring(i, i +1).equals(word.substring(i + 1, i + 2))
                && !word.substring(i, i + 1).equals(" ")) {
                return true;
        }
        return false;
    }
    
}
