import java.util.Scanner;

public class Game {
    // main class to run the game

    public static void main(String[] args){
        // FIXME: hopefully this is temporary
        Scanner scnr = new Scanner(System.in);

        // creating mouse listener
        MyMouseListener mouse = new MyMouseListener();

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
            board.setMessage(message);

            // getting location where they clicked and drawing the appropriate piece
            // FIXME: need to figure out where the user clicked
            // FIXME: if this isn't possible, we can use the console
            xCoord = mouse.xValue();
            yCoord = mouse.yValue();
            // while they haven't clicked keep waiting for them to click
            while (xCoord == -1 || yCoord == -1){
                xCoord = mouse.xValue();
                yCoord = mouse.yValue();
            }

            //xCoord = 0; // FIXME: figure out where they clicked
            //yCoord = 0; // FIXME: figure out where they clicked

            /*
            // FIXME: hopefully this is temporary
            System.out.println("What is your x-coordinate? ");
            xCoord = scnr.nextInt();
            System.out.println("What is your y-coordinate? ");
            yCoord = scnr.nextInt();
            */

            if (xTurn){
                board.drawPiece(xCoord, yCoord, 'x');
            }
            else {
                board.drawPiece(xCoord, yCoord, 'o');
            }

            // adding piece to array of locations
            if (locations[xCoord][yCoord] != '\u0000'){
                // preventing player from choosing a spot that's already occupied
                // FIXME: need to test whether this works
                continue;
            }
            else if (xTurn){
                locations[xCoord][yCoord] = 'x';
            }
            else {
                locations[xCoord][yCoord] = 'o';
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
        if (winType == 0){
            board.setMessage("It's a tie!");
        }
        // win
        else {
            // figuring out the winner
            String winner;
            if (oTurn){
                winner = "O";
            }
            else {
                winner = "X";
            }
            // displaying winning message
            board.setMessage("The winner is player " + winner + "!");

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
