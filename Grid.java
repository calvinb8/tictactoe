import java.awt.*;
import javax.swing.JComponent;

public class Grid extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        // drawing the grid as very thin rectangles
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
    }
}
