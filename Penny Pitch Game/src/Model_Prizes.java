/*
Author : Dhvani Pancholi
Description: This section of the code is focused on finding and generating the prizes and inputting brackets
around selected prizes which have been won.
Date Completed : 2019-01-31

 */

public class Model_Prizes extends Controller_Pennies{

    private boolean prizes[][] = new boolean[6][6];

    private int doll[] = new int[2];
    private int ball[] = new int[2];
    private int poster[] = new int[2];
    private int puzzle[] = new int[2];
    private int game[] = new int[2];

    public Model_Prizes(){
        //  default constructor
    }

    public void Ball(){

        //Loop generating positions for all BALL prizes
        for(int i = 0; i <=ball.length; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(prizes[Xvalue][Yvalue] == true) {
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);

            }

            if (board[Xvalue][Yvalue] == "[[      ]] ") {

                board[Xvalue][Yvalue] = "[[ BALL ]] ";
                ballVal++;
                System.out.println(ballVal);
            }
            else {
                board[Xvalue][Yvalue] = "[  BALL  ] ";

            }
            prizes[Xvalue][Yvalue] = true;
        }
    }


    public void Doll(){ //Generate positions for DOLL prizes
        for(int i = 0; i <=2; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(prizes[Xvalue][Yvalue] == true) {
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);
            }
            if (board[Xvalue][Yvalue] == "[[      ]] ") {
                board[Xvalue][Yvalue] = "[[ DOLL ]] ";
                dollVal++;

            } else {
                board[Xvalue][Yvalue] = "[  DOLL  ] ";
            }
            prizes[Xvalue][Yvalue] = true;
        }
    }

    public void Poster(){
        //Loop generating positions for all POSTER prizes
        for(int i = 0; i <=2; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(prizes[Xvalue][Yvalue] == true) {
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);
            }
            if (board[Xvalue][Yvalue] == "[[      ]] ") {
                board[Xvalue][Yvalue] = "[[POSTER]] ";
                posterVal++;
            } else {
                board[Xvalue][Yvalue] = "[ POSTER ] ";
            }
            prizes[Xvalue][Yvalue] = true;
        }
    }

    public void Puzzle(){
        //Loop generating positions for all PUZZLE prizes
        for(int i = 0; i <=2; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(prizes[Xvalue][Yvalue] == true) {
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);
            }
            if (board[Xvalue][Yvalue] == "[[      ]] ") {
                board[Xvalue][Yvalue] = "[[PUZZLE]] ";
                puzzleVal++;
            } else {
                board[Xvalue][Yvalue] = "[ PUZZLE ] ";
            }
            prizes[Xvalue][Yvalue] = true;
        }
    }

    public void Game(){
        //loop generating all GAME prize positions
        for(int i = 0; i <=2; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(prizes[Xvalue][Yvalue] == true) {
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);
            }
            if (board[Xvalue][Yvalue] == "[[      ]] ") {
                board[Xvalue][Yvalue] = "[[ GAME ]] ";

                gameVal++;
            } else {
                board[Xvalue][Yvalue] = "[  GAME  ] ";
            }
            prizes[Xvalue][Yvalue] = true;
        }
    }
}