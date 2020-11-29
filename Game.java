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

        // keeping track of current coordinates
        int xCoord;
        int yCoord;

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
            xCoord = 0; // FIXME: figure out where they clicked
            yCoord = 0; // FIXME: figure out where they clicked
            if (xTurn){
                board.drawPiece(xCoord, yCoord, 'x');
            }
            else {
                board.drawPiece(xCoord, yCoord, 'o');
            }

            // adding piece to array of locations
            if (xTurn){
                locations[xCoord][yCoord] = 'x';
            }
            else {
                locations[xCoord][yCoord] = 'o';
            }

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

        // after loop is broken the game is over

        // tie
        if (!isWinner){
            board.setMessage("It's a tie!");
        }
        else {
            // FIXME: draw/highlight the winning combination of pieces
        }
    }
}
