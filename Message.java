import javax.swing.*;
import java.awt.*;

// FIXME: make it delete the text before it draws more

public class Message extends JPanel {
    // the message
    private String text;
    private JLabel message;

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
