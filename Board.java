import javax.swing.JFrame;

public class Board {
    Board() {
        JFrame board = new JFrame();

        board.setTitle("Tic Tac Toe");
        board.setSize(600, 700);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Grid grid = new Grid();
        board.add(grid);

        board.setVisible(true);

    }

    public void setMessage(String message){
        // FIXME: add the ability to put a message at the bottom (using String message as the message)
    }

    public void drawPiece(int x, int y, char type){
        if (type == 'o'){
            PieceO piece = new PieceO(x, y);
        }
        if (type == 'x'){
            PieceX piece = new PieceX(x, y);
        }
        // FIXME: draw piece at given coordinates
    }
}
