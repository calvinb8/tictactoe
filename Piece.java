abstract class Piece {
    private int xCoordinate;
    private int yCoordinate;

    Piece (int x, int y){
        // creates the piece at the given coordinates
        xCoordinate = x;
        yCoordinate = y;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }

    public int getYCoordinate(){
        return yCoordinate;
    }

    abstract void drawPiece();
    abstract char getType();
}
