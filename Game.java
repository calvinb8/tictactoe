public class Game {
    // main class to run the game

    public static void main(String[] args){
        // drawing board
        Board board = new Board();

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
            String message = "Current Player: ";
            if (xTurn){
                message += "X";
            }
            if (oTurn){
                message += "O";
            }
            board.setMessage(message);

            // getting location where they clicked and drawing the appropriate piece
            // FIXME: do this with graphics

            // adding piece to array of locations
            // FIXME: once graphics stuff is done this will be easy

            // winner checker
            // FIXME: add in a thing that highlights the winning pieces if there's a winner
            // horizontal
            for (int i = 0; i < 3; ++i){
                if (locations[i][0] == '\u0000' || locations[i][1] == '\u0000' || locations[i][2] == '\u0000'){
                    continue;
                }
                if (locations[i][0] == locations[i][1] && locations[i][1] == locations[i][2]){
                    isWinner = true;
                    break;
                }
            }
            // vertical
            for (int i = 0; i < 3; ++i){
                if (locations[0][i] == '\u0000' || locations[1][i] == '\u0000' || locations[2][i] == '\u0000'){
                    continue;
                }
                if (locations[0][i] == locations[1][i] && locations[1][i] == locations[2][i]){
                    isWinner = true;
                    break;
                }
            }
            // diagonal
            if (locations[0][0] != '\u0000' && locations[1][1] != '\u0000' && locations[2][2] != '\u0000'){
                if (locations[0][0] == locations[1][1] && locations[1][1] == locations[2][2]){
                    isWinner = true;
                    break;
                }
            }

            if (locations[2][0] != '\u0000' && locations[0][2] != '\u0000' && locations[2][2] != '\u0000'){
                if (locations[2][0] == locations[1][1] && locations[1][1] == locations[0][2]){
                    isWinner = true;
                    break;
                }
            }

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
