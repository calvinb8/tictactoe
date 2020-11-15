abstract class Piece {
    private int xCoordinate;
    private int yCoordinate;

    Piece (int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }

    public int getYCoordinate(){
        return yCoordinate;
    }

    
}
