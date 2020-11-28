import javax.swing.JFrame;

public class TicTacToeBoard {
    public static void main(String[] args) {
        JFrame board = new JFrame();

        board.setTitle("Tic Tac Toe");
        board.setSize(600, 600);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TicTacToeGrid grid = new TicTacToeGrid();
        board.add(grid);

        board.setVisible(true);

    }
}
