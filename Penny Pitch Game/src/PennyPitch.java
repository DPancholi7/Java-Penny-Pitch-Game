/*
Authors : Dhvani Pancholi
Description : This is the main section of the code, in this section, the code calls out all the functions which play
 the roles of executing this pennypitch game perfectly.
 Date Completed : 2019-01-31
 */
public class PennyPitch {

    Model_Prizes plot = new Model_Prizes(); //object instantiation of Model class which is the M_Prizes


    public static void main(String args[]){
        PennyPitch call = new PennyPitch();
        System.out.println("--------------------Welcome To My PennyPitch Game!--------------------"); // Introduction Message
        call.run();


    }

public void run() {
// all functions being called
    plot.createBoard();
    plot.spawnPos();
    plot.Ball();
    plot.Doll();
    plot.Poster();
    plot.Puzzle();
    plot.Game();
    plot.displayBoard();
    plot.displayWins();
    }

}

