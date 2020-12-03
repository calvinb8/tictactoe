import javax.swing.*;
import java.awt.*;

public class PieceO extends JComponent{
    private int x;
    private int y;

    PieceO(int xCoordinate, int yCoordinate) {
        // creates the piece at the given coordinates
        x = xCoordinate;
        y = yCoordinate;
    }

    @Override
    public void paintComponent(Graphics g) {
        // drawing the piece at its coordinates
        Graphics2D graphicsObj = (Graphics2D) g;

        switch (y){
            case 0:
                switch (x){
                    case 0:
                        // top left
                        graphicsObj.drawOval(0, 0, 200, 200);
                        break;
                    case 1:
                        // top middle
                        graphicsObj.drawOval(210, 0, 190, 200);
                        break;
                    case 2:
                        // top right
                        graphicsObj.drawOval(410, 0, 190, 200);
                        break;
                }
            break;
            case 1:
                switch (x){
                    case 0:
                        // middle left
                        graphicsObj.drawOval(0, 210, 200, 190);
                        break;
                    case 1:
                        // center
                        graphicsObj.drawOval(210, 210, 190, 190);
                        break;
                    case 2:
                        // middle right
                        graphicsObj.drawOval(410, 210, 190, 190);
                        break;
                }
            break;
            case 2:
                switch (x){
                    case 0:
                        // bottom left
                        graphicsObj.drawOval(0, 410, 200, 190);
                        break;
                    case 1:
                        // bottom middle
                        graphicsObj.drawOval(210, 410, 190, 190);
                        break;
                    case 2:
                        // bottom right
                        graphicsObj.drawOval(410, 410, 190, 190);
                        break;
                }
            break;
        }
    }
}
