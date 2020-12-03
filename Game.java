import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        // creating a scanner for the user input in the console
        Scanner scnr = new Scanner(System.in);

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

        // tracking the winner
        // 0 = tie, 1-3 = horizontal, 4-6 = vertical, 7-8 = diagonal
        int winType = 0;

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
            System.out.println(message);

            // prompting the user to enter the coordinates of their move
            System.out.println("What is your x-coordinate? ");
            xCoord = scnr.nextInt();
            System.out.println("What is your y-coordinate? ");
            yCoord = scnr.nextInt();

            // adding piece to array of locations and checking move validity
            if (xCoord > 2 || xCoord < 0 || yCoord > 2 || yCoord < 0){
                // if they try to go somewhere outside of the grid
                System.out.println("Invalid move");
                continue;
            }
            else if (locations[xCoord][yCoord] != '\u0000'){
                // preventing player from choosing a spot that's already occupied
                System.out.println("Invalid move");
                continue;
            }
            // updating the array
            else if (xTurn){
                locations[xCoord][yCoord] = 'x';
            }
            else {
                locations[xCoord][yCoord] = 'o';
            }

            // drawing the pieces on the board
            if (xTurn){
                board.drawPiece(xCoord, yCoord, 'x');
            }
            else {
                board.drawPiece(xCoord, yCoord, 'o');
            }

            // winner checker
            // horizontal
            for (int i = 0; i < 3; ++i){
                if (locations[0][i] == '\u0000' || locations[1][i] == '\u0000' || locations[2][i] == '\u0000'){
                    continue;
                }
                if (locations[0][i] == locations[1][i] && locations[1][i] == locations[2][i]){
                    isWinner = true;
                    switch (i){
                        case (0):
                            winType = 1;
                            break;
                        case (1):
                            winType = 2;
                            break;
                        case (2):
                            winType = 3;
                            break;
                    }
                    break;
                }
            }
            // vertical
            for (int i = 0; i < 3; ++i){
                if (locations[i][0] == '\u0000' || locations[i][1] == '\u0000' || locations[i][2] == '\u0000'){
                    continue;
                }
                if (locations[i][0] == locations[i][1] && locations[i][1] == locations[i][2]){
                    isWinner = true;
                    switch (i){
                        case (0):
                            winType = 4;
                            break;
                        case (1):
                            winType = 5;
                            break;
                        case (2):
                            winType = 6;
                            break;
                    }
                    break;
                }
            }
            // diagonal
            if (locations[0][0] != '\u0000' && locations[1][1] != '\u0000' && locations[2][2] != '\u0000'){
                if (locations[0][0] == locations[1][1] && locations[1][1] == locations[2][2]){
                    isWinner = true;
                    winType = 7;
                    break;
                }
            }

            if (locations[2][0] != '\u0000' && locations[0][2] != '\u0000' && locations[2][2] != '\u0000'){
                if (locations[2][0] == locations[1][1] && locations[1][1] == locations[0][2]){
                    isWinner = true;
                    winType = 8;
                    break;
                }
            }

            // updating whose turn it is
            xTurn = !xTurn;
            oTurn = !oTurn;
            numTurns++;

            // number of turns checker
            if (numTurns == 9){
                break;
            }
        }

        // after loop is broken the game is over
        // tie
        if (winType == 0){
            System.out.println("It's a tie!");
        }
        // win
        else {
            // figuring out the winner
            String winner;
            if (xTurn){
                winner = "O";
            }
            else {
                winner = "X";
            }
            // displaying winning message
            System.out.println("The winner is player " + winner + "!");

            // figuring out which ones to highlight
            // 1-3 = horizontal, 4-6 = vertical, 7-8 = diagonal
            switch (winType){
                case (1):
                    board.highlightSquare(0, 0);
                    board.highlightSquare(1, 0);
                    board.highlightSquare(2, 0);
                    break;
                case (2):
                    board.highlightSquare(0, 1);
                    board.highlightSquare(1, 1);
                    board.highlightSquare(2, 1);
                    break;
                case (3):
                    board.highlightSquare(0, 2);
                    board.highlightSquare(1, 2);
                    board.highlightSquare(2, 2);
                    break;
                case (4):
                    board.highlightSquare(0, 0);
                    board.highlightSquare(0, 1);
                    board.highlightSquare(0, 2);
                    break;
                case (5):
                    board.highlightSquare(1, 0);
                    board.highlightSquare(1, 1);
                    board.highlightSquare(1, 2);
                    break;
                case (6):
                    board.highlightSquare(2, 0);
                    board.highlightSquare(2, 1);
                    board.highlightSquare(2, 2);
                    break;
                case (7):
                    board.highlightSquare(0, 0);
                    board.highlightSquare(1, 1);
                    board.highlightSquare(2, 2);
                    break;
                case (8):
                    board.highlightSquare(0, 2);
                    board.highlightSquare(1, 1);
                    board.highlightSquare(2, 0);
                    break;
            }
        }
    }
}
