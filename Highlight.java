import javax.swing.*;
import java.awt.*;

public class Highlight extends JComponent {
    private int x;
    private int y;
    private int width = 190;
    private int height = 190;

    Highlight(int xCoordinate, int yCoordinate){
        x = xCoordinate * 200 + 10;
        y = yCoordinate * 200 + 10;
        if (xCoordinate == 0){
            x = 0;
            width = 200;
        }
        if (yCoordinate == 0){
            y = 0;
            height = 200;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphicsObj = (Graphics2D) g;

        // making a transparent color
        Color color = new Color(255, 255, 153, 150);

        // making the outline
        Rectangle box = new Rectangle(x, y, width, height);

        // drawing the highlight
        graphicsObj.setColor(color);
        graphicsObj.fill(box);
    }
}
