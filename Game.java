public class Game {
    public static void main(String[] args){
        // keeping track of whose turn it is
        boolean xTurn = true;
        boolean oTurn = false;

        // keeping track of the total number of turns
        int numTurns = 0;

        // keeping track of piece locations
        char[][] locations = new char[3][3];

        // while loop to run game
        boolean isWinner = false;
        while (!isWinner){
            // displaying the message for whose turn it is
            // FIXME: do this with graphics

            // getting location where they clicked and drawing the appropriate piece
            // FIXME: do this with graphics

            // adding piece to array of locations
            // FIXME: once graphics stuff is done this will be easy

            // winner checker
            // FIXME: I just need to write a bunch of for loops yay

            // number of turns checker
            if (numTurns == 9){
                break;
            }

            // updating whose turn it is
            xTurn = !xTurn;
            oTurn = !oTurn;
            numTurns++;
        }
    }
}
