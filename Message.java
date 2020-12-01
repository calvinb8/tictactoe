import javax.swing.*;
import java.awt.*;

// FIXME: idk why this doesn't work

public class Message extends JPanel {
    // the message
    private String text;

    Message(String message){
        // initializing Message
        text = message;
    }

    @Override
    public void paintComponent(Graphics g){
        // drawing the message at the bottom of the screen
        g.drawString(text, 30, 650);
    }
}
