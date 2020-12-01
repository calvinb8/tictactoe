public class PieceO extends Piece{
    PieceO(int x, int y) {
        // creates the piece at the given coordinates
        super(x, y);
    }

    @Override
    public void drawPiece(){
        // draws the o piece at the given coordinates
        // FIXME: actually draw the piece
        // converting from board coordinates to pixel coordinates
        int actualX = (1 + super.getXCoordinate()) * 200 - 50;
        int actualY = (1 + super.getYCoordinate()) * 200 - 50;
    }

    @Override
    public char getType(){
        // returns the type of piece (o)
        return 'o';
    }
}
