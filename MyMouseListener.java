import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyMouseListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getX() < 400 && e.getX() > 200 && e.getY() > 200 && e.getY() < 400) {
            //FIXME: if true, make an "X" show up on the center square for the Tic Tic Toe board
            //follow suit for all of the other X and Y values as well
        }
    }
}
