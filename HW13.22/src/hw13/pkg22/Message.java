
package hw13.pkg22;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Message extends JFrame
{
    public Message()
    {
        Message message = new Message();
        add(message);
        message.setBackground(Color.CYAN);
        message.setFont(new Font("Times New Roman", Font.BOLD,50));
    }
}
