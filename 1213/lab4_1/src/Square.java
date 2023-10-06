import java.util.Scanner;
import java.util.Random;
// import java.util.Math;

public class Square {

    private int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size) {
        square = new int[size][size];

    }
    
    //--------------------------------------
    //create new square using given 2D array
    //--------------------------------------
    public Square(int[][] matrix) {
        square = matrix;

    }

    //--------------------------------------
    //return the square 2D array
    //--------------------------------------
    public int[][] getSquare() {
        return square;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row) {
        int total = 0;
        //Add code here!
        for(int col = 0; col<square[row].length; col++){
            total += square[row][col];
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumColumn(int col) {
        int total = 0;
        //Add code here!
        for(int row=0; row<square[col].length; row++){
            total += square[row][col];
        }
        return total;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag() {
        int total = 0;
        //Add code here!
        for(int i=0; i< square.length; i++){
            total += square[i][i];
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag() {
        int total = 0;
        for(int i = 0; i< square.length; i++){
            total += square[i][square.length - 1 -i];
        }

        return total;

    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean isMagic() {
        //Add code here!
        int total = sumRow(0);
        for(int r = 1; r<square.length;r++){
            if(sumRow(r) != total){
                return false;
            }
        }
        for(int c=0; c< square.length; c++){
            if(sumColumn(c) != total){
                return false;
            }
        }
        if(sumMainDiag() != total){
            return false;
        }
        if(sumOtherDiag() != total){
            return false;
        }
        return true;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare(Scanner scan) {
        
        System.out.println("Input 1 for an auto-generated square, input 2 for a user-defined square");
        if(scan.nextInt() == 1){
            randomAssign();
        } else{
            //printSquare();
            for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.println("Enter an integer number");
                square[row][col] = scan.nextInt();
            }
        }
        }

    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "  ");
            }
            System.out.println("");
        }

        

    }

    public void randomAssign(){
        int randInt;
        
        
        for(int i=0; i< square.length;i++){
            for(int j=0; j<square.length; j++){
                randInt = (int)(Math.random() * 9) + 1;
                square[j][i] = randInt;
            }
        }
    }
}