public class PieceX extends Piece{
    PieceX(int x, int y) {
        // creates the piece at the given coordinates
        super(x, y);
    }

    @Override
    public void drawPiece(){
        // draws the x piece at the given coordinate
    }

    @Override
    public char getType(){
        // returns the type of piece (x)
        return 'x';
    }
}
