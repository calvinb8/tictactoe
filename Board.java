import javax.swing.JFrame;

public class Board {
    private JFrame board = new JFrame();

    Board() {
        board.setTitle("Tic Tac Toe");
        board.setSize(600, 700);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Grid grid = new Grid();
        board.add(grid);

        board.setVisible(true);

    }

    public void setMessage(String message){
        // writes a message below the board
        // FIXME: add the ability to put a message at the bottom (using String message as the message)
    }

    public void drawPiece(int x, int y, char type){
        // adds a piece at given coordinates and draws it on the board
        if (type == 'o'){
            PieceO piece = new PieceO(x, y);
            board.add(piece);
        }
        if (type == 'x'){
            PieceX piece = new PieceX(x, y);
            board.add(piece);
        }
    }

    public void highlightSquare(int x, int y){
        // highlights a given square (for winner)
        // FIXME: add ability to highlight square
    }
}
