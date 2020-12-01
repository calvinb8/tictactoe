import javax.swing.*;
import java.awt.*;

// FIXME: not sure why this isn't working

public class Highlight extends JComponent {
    private int x;
    private int y;

    Highlight(int xCoordinate, int yCoordinate){
        x = xCoordinate * 210;
        y = yCoordinate * 210;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphicsObj = (Graphics2D) g;

        // making a transparent color
        // FIXME: test transparency
        Color color = new Color(255, 255, 153, 100);

        // making the outline
        Rectangle box = new Rectangle(x, y, 180, 180);

        // drawing the highlight
        graphicsObj.setColor(color);
        graphicsObj.fill(box);
    }
}
