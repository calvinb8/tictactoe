import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class PieceX extends JComponent{
    private int x;
    private int y;

    PieceX(int xCoordinate, int yCoordinate) {
        // creates the piece at the given coordinates
        x = xCoordinate;
        y = yCoordinate;
    }

    @Override
    public void paintComponent(Graphics g) {
        // drawing the piece at its given coordinates
        Graphics2D graphicsObj = (Graphics2D) g;

        switch (y){
            case 0:
                switch (x){
                    case 0:
                        // top left
                        Line2D.Double topLeft1 = new Line2D.Double(0, 0, 200, 200);
                        graphicsObj.draw(topLeft1);
                        Line2D.Double topLeft2 = new Line2D.Double(0, 200, 200, 0);
                        graphicsObj.draw(topLeft2);
                        break;
                    case 1:
                        // top middle
                        Line2D.Double centerTop1 = new Line2D.Double(200, -10, 400, 200);
                        graphicsObj.draw(centerTop1);
                        Line2D.Double centerTop2 = new Line2D.Double(200, 210, 400, 0);
                        graphicsObj.draw(centerTop2);
                        break;
                    case 2:
                        // top right
                        Line2D.Double topRight1 = new Line2D.Double(400, -10, 600, 200);
                        graphicsObj.draw(topRight1);
                        Line2D.Double topRight2 = new Line2D.Double(400, 210, 600, 0);
                        graphicsObj.draw(topRight2);
                        break;
                }
            break;
            case 1:
                switch (x){
                    case 0:
                        // middle left
                        Line2D.Double centerLeft1 = new Line2D.Double(-10, 200, 200, 400);
                        graphicsObj.draw(centerLeft1);
                        Line2D.Double centerLeft2 = new Line2D.Double(-12, 410, 210, 200);
                        graphicsObj.draw(centerLeft2);
                        break;
                    case 1:
                        // center
                        Line2D.Double center1 = new Line2D.Double(200, 200, 400, 400);
                        graphicsObj.draw(center1);
                        Line2D.Double center2 = new Line2D.Double(200, 409, 409, 200);
                        graphicsObj.draw(center2);
                        break;
                    case 2:
                        // middle right
                        Line2D.Double centerRight1 = new Line2D.Double(400, 200, 600, 400);
                        graphicsObj.draw(centerRight1);
                        Line2D.Double centerRight2 = new Line2D.Double(400, 410, 610, 200);
                        graphicsObj.draw(centerRight2);
                        break;
                }
            break;
            case 2:
                switch (x){
                    case 0:
                        // bottom left
                        Line2D.Double bottomLeft1 = new Line2D.Double(-10, 400, 200, 600);
                        graphicsObj.draw(bottomLeft1);
                        Line2D.Double bottomLeft2 = new Line2D.Double(0, 600, 210, 400);
                        graphicsObj.draw(bottomLeft2);
                        break;
                    case 1:
                        // bottom middle
                        Line2D.Double centerBottom1 = new Line2D.Double(200, 400, 400, 600);
                        graphicsObj.draw(centerBottom1);
                        Line2D.Double centerBottom2 = new Line2D.Double(200, 609, 409, 400);
                        graphicsObj.draw(centerBottom2);
                        break;
                    case 2:
                        // bottom right
                        Line2D.Double bottomRight1 = new Line2D.Double(400, 400, 600, 600);
                        graphicsObj.draw(bottomRight1);
                        Line2D.Double bottomRight2 = new Line2D.Double(400, 609, 609, 400);
                        graphicsObj.draw(bottomRight2);
                        break;
                }
            break;
        }
    }

    public char getType(){
        // returns the type of piece (x)
        return 'x';
    }
}
