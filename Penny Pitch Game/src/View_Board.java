/*
Author : Dhvani Pancholi
Description : This section of the code is responsible for creating the pennypitch board,
 displaying the board and generating the located prizes.
 Date Completed : 2019-01-31
 */

import java.util.Random; // importing Library

public class View_Board {
    public String board[][] = new String[6][6]; // View_PennyPitch Board
    Random random = new Random();

    // Variables Values
    public int Xvalue;
    public int Yvalue;
    public int gameVal;
    public int ballVal;
    public int puzzleVal;
    public int posterVal;
    public int dollVal;

    public View_Board(){
        //default constructor
    }

    public void createBoard() { // Creating Board
        for(int row = 0; row <= 4; row++){
            for(int col =  0; col <= 4; col++){
                board[row][col] = "[        ] ";
            }
        }
    }

    public void displayBoard(){ // Displaying Board
        System.out.println("Generating Layout");

        System.out.println(board[0][0] + board[1][0] + board[2][0] + board[3][0] + board[4][0] + "\n" +
                           board[0][1] + board[1][1] + board[2][1] + board[3][1] + board[4][1] + "\n" +
                           board[0][2] + board[1][2] + board[2][2] + board[3][2] + board[4][2] + "\n" +
                           board[0][3] + board[1][3] + board[2][3] + board[3][3] + board[4][3] + "\n" +
                           board[0][4] + board[1][4] + board[2][4] + board[3][4] + board[4][4] + "\n" );
    }

    public void displayWins(){ // Displaying Rewards

        System.out.println("PRIZES ");
        System.out.println("You have won " + ballVal + " Balls");
        System.out.println("You have won " + gameVal + " Games");
        System.out.println("You have won " + puzzleVal + " Puzzles");
        System.out.println("You have won " + posterVal + " Posters");
        System.out.println("You have won " + dollVal + " Dolls");

    }


}
