
import java.util.Scanner;
import java.util.Random;
public class MazeModel {

    public static void main(String[] args) {
        MazeModel mp = new MazeModel();
    }

    public MazeModel() {
         int[][] gridArray = new int[40][40];
         System.out.println("Model has been created!");
         Random rand = new Random();
         int rows = gridArray.length;
         int columns = gridArray[1].length;
         printModel(rows, columns, gridArray, rand);
    }
    private void printModel(int rows, int columns, int[][] gridArray, Random rand) {
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                gridArray[r][c] = rand.nextInt(5);
                System.out.print("" + gridArray[r][c]);
            }
            System.out.println("");
        }
    }
    
}
