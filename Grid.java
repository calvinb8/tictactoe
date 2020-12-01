import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class Grid extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphicsObj = (Graphics2D) g;

        Color normal = new Color(0, 0, 0);
        graphicsObj.setColor(normal);

        Rectangle column1 = new Rectangle(200, 0, 10, 600);
        graphicsObj.fill(column1);

        Rectangle column2 = new Rectangle(400, 0, 10, 600);
        graphicsObj.fill(column2);

        Rectangle row1 = new Rectangle(0, 200, 600, 10);
        graphicsObj.fill(row1);

        Rectangle row2 = new Rectangle(0, 400, 600, 10);
        graphicsObj.fill(row2);

        //Xs
        //center
        Line2D.Double center1 = new Line2D.Double(200, 200, 400, 400);
        graphicsObj.draw(center1);
        Line2D.Double center2 = new Line2D.Double(200, 409, 409, 200);
        graphicsObj.draw(center2);

        //middle left
        Line2D.Double centerLeft1 = new Line2D.Double(-10, 200, 200, 400);
        graphicsObj.draw(centerLeft1);
        Line2D.Double centerLeft2 = new Line2D.Double(-12, 410, 210, 200);
        graphicsObj.draw(centerLeft2);

        //middle right
        Line2D.Double centerRight1 = new Line2D.Double(400, 200, 600, 400);
        graphicsObj.draw(centerRight1);
        Line2D.Double centerRight2 = new Line2D.Double(400, 410, 610, 200);
        graphicsObj.draw(centerRight2);

        //top middle
        Line2D.Double centerTop1 = new Line2D.Double(200, -10, 400, 200);
        graphicsObj.draw(centerTop1);
        Line2D.Double centerTop2 = new Line2D.Double(200, 210, 400, 0);
        graphicsObj.draw(centerTop2);

        //bottom middle
        Line2D.Double centerBottom1 = new Line2D.Double(200, 400, 400, 600);
        graphicsObj.draw(centerBottom1);
        Line2D.Double centerBottom2 = new Line2D.Double(200, 609, 409, 400);
        graphicsObj.draw(centerBottom2);

        //top left
        Line2D.Double topLeft1 = new Line2D.Double(0, 0, 200, 200);
        graphicsObj.draw(topLeft1);
        Line2D.Double topLeft2 = new Line2D.Double(0, 200, 200, 0);
        graphicsObj.draw(topLeft2);

        //top right
        Line2D.Double topRight1 = new Line2D.Double(400, -10, 600, 200);
        graphicsObj.draw(topRight1);
        Line2D.Double topRight2 = new Line2D.Double(400, 210, 600, 0);
        graphicsObj.draw(topRight2);

        //bottom right
        Line2D.Double bottomRight1 = new Line2D.Double(400, 400, 600, 600);
        graphicsObj.draw(bottomRight1);
        Line2D.Double bottomRight2 = new Line2D.Double(400, 609, 609, 400);
        graphicsObj.draw(bottomRight2);

        //bottom left
        Line2D.Double bottomLeft1 = new Line2D.Double(-10, 400, 200, 600);
        graphicsObj.draw(bottomLeft1);
        Line2D.Double bottomLeft2 = new Line2D.Double(0, 600, 210, 400);
        graphicsObj.draw(bottomLeft2);


        //Os
        graphicsObj.drawOval(210, 210, 190, 190); //center
        graphicsObj.drawOval(0, 210, 200, 190); //left center
        graphicsObj.drawOval(410, 410, 190, 190); //bottom right
        graphicsObj.drawOval(410, 210, 190, 190); //right center
        graphicsObj.drawOval(210, 0, 190, 200); //top middle
        graphicsObj.drawOval(210, 410, 190, 190); //bottom middle
        graphicsObj.drawOval(0, 0, 200, 200); //top left
        graphicsObj.drawOval(410, 0, 190, 200); //top right
        graphicsObj.drawOval(0, 410, 200, 190); //bottom left


    }
}
