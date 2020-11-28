public class PieceO extends Piece{
    PieceO(int x, int y) {
        // creates the piece at the given coordinates
        super(x, y);
    }

    @Override
    public void drawPiece(){
        // draws the o piece at the given coordinates
    }

    @Override
    public char getType(){
        // returns the type of piece (o)
        return 'o';
    }
}
