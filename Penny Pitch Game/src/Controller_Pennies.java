/*
Author: Dhvani Pancholi
Description : This section of the ocde is developed to generate the location of where the pennies will land and
it randomly assigns the pennies across the board.
Date Completed : 2019-01-31
 */
public class Controller_Pennies extends View_Board{
    boolean pennies[][] = new boolean[6][6];

    public Controller_Pennies(){
        //default constructor
    }

    public void spawnPos(){ //method that randomly generates the positions for the pennies
        for(int i = 0; i <=9; i++){
            Xvalue = random.nextInt(5);
            Yvalue = random.nextInt(5);
            while(pennies[Xvalue][Yvalue] == true){
                Xvalue = random.nextInt(5);
                Yvalue = random.nextInt(5);
            }
            board[Xvalue][Yvalue] = "[[      ]] ";
            pennies[Xvalue][Yvalue] = true;
        }
    }

}
