import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyMouseListener extends MouseAdapter {
    private int xCoordinate = -1;
    private int yCoordinate = -1;

    @Override
    public void mouseClicked(MouseEvent e) {
        // FIXME: set the coordinates for the given square
        if (e.getX() < 400 && e.getX() > 200 && e.getY() > 200 && e.getY() < 400) {
            //follow suit for all of the other X and Y values as well
        }
    }

    public int xValue(){
        int xTemp = xCoordinate;
        xCoordinate = -1;
        return xTemp;
    }

    public int yValue(){
        int yTemp = yCoordinate;
        yCoordinate = -1;
        return yTemp;
    }
}
