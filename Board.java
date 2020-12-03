import javax.swing.JFrame;

public class Board {
    // creating the GUI window
    private JFrame board = new JFrame();

    Board() {
        // setting up the board
        board.setTitle("Tic Tac Toe");
        board.setSize(610, 640);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding the grid to the board
        Grid grid = new Grid();
        board.add(grid);

        board.setVisible(true);

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
        board.revalidate();
    }

    public void highlightSquare(int x, int y){
        // highlights a given square (for winner)
        Highlight highlight = new Highlight(x, y);
        board.add(highlight);
        board.revalidate();
    }
}
