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

    public void setMessage(String text){
        // writes a message below the board
        // FIXME: need to delete messages
        Message message = new Message(text);
        board.add(message);
        board.revalidate();
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
