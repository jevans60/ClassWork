
package hw12.pkg10;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Frame extends JFrame
{
public Frame()
    {
        setSize(400, 400);
        setTitle("Exercise 12_10");
        setLayout(new GridLayout(8, 0));

        for (int i = 0; i < 8; i++)
        {
            
            add(GetRowPanel(i%2==0));
        }

    }

    public JPanel GetRowPanel(boolean startWithBlack)
    {   
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(0, 8));
        
        for (int i = 0; i < 8; i++)
        {
            JButton jButton = new JButton(); 
            if(startWithBlack)
            {
              jButton.setBackground(Color.BLACK);
            }
            startWithBlack = !startWithBlack;
            jPanel.add(jButton);
        }

        return jPanel;
    }

   
}
