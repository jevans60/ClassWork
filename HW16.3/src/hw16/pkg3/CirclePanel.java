
package hw16.pkg3;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class CirclePanel extends JPanel
{   
    int x = 20;
    int y = 20;
    
    public void Circle(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int ovalWidth = (int)(width*.05);
        int ovalHeight = (int)(height*.05);
        g.drawOval(x, y, ovalWidth, ovalHeight);
        
    }
    
    @Override
    public void paintComponent(final Graphics g)
    {
        super.paintComponent(g);
        Circle(g);
      
       addMouseMotionListener(new MouseMotionListener() 
       {
            @Override 
            public void mouseDragged(MouseEvent e) 
                {
                     x = e.getX();
                     y = e.getY();
                     repaint();
                }

        @Override /** Handle mouse-moved event */
        public void mouseMoved(MouseEvent e)
            {
            }
        });
       
       addKeyListener(new KeyListener()
       {

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) 
            {
                 if (e.getKeyCode() == KeyEvent.VK_RIGHT ) 
                {
                    x++;
                    repaint();
                } 
                else if (e.getKeyCode() == KeyEvent.VK_LEFT ) 
                {
                    x--;
                    repaint();
                }
                else if (e.getKeyCode() == KeyEvent.VK_UP ) 
                {  
                    y++;
                    repaint();
                } 
                else if (e.getKeyCode() == KeyEvent.VK_DOWN ) 
                {
                    y--;
                    repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
            
    }

   
    
}
   


