import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class TicTacToeGrid extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphicsObj = (Graphics2D) g;

        Rectangle column1 = new Rectangle(200, 0, 10, 600);
        Color normal = new Color(0, 0, 0);
        graphicsObj.setColor(normal);
        graphicsObj.fill(column1);

        Rectangle column2 = new Rectangle(400, 0, 10, 600);
        graphicsObj.fill(column2);

        Rectangle row1 = new Rectangle(0, 200, 600, 10);
        graphicsObj.fill(row1);

        Rectangle row2 = new Rectangle(0, 400, 600, 10);
        graphicsObj.fill(row2);
    }
}
