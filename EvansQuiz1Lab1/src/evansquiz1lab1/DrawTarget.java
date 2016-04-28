
package evansquiz1lab1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawTarget extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Circle1(g);
        Square1(g);
        Circle2(g);
        Circle3(g);
    }
    
    private void Square1(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int startX = (int)(width*.05);
        int startY = (int)(height*.05);
        int sqWidth = (int)(width*.9);
        int sqHeight = (int)(height*.9);
        g.setColor(Color.BLACK);
        g.drawRect(startX, startY, sqWidth, sqHeight);
    }

    private void Circle1(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int startX = (int)(width*.10);
        int startY = (int)(height *.10);
        int ovalWidth = (int)(width*.8);
        int ovalHeight = (int)(height*.8);
        
        g.setColor(Color.RED);
        g.drawOval(startX, startY, ovalWidth, ovalHeight);
        g.fillOval(startX, startY, ovalWidth, ovalHeight);
    }
    
    private void Circle2(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int startX = (int)(width*.20);
        int startY = (int)(height *.20);
        int ovalWidth = (int)(width*.6);
        int ovalHeight = (int)(height*.6);
        
        g.setColor(Color.WHITE);
        g.drawOval(startX, startY, ovalWidth, ovalHeight);
        g.fillOval(startX, startY, ovalWidth, ovalHeight);
    }
    
    private void Circle3(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int startX = (int)(width*.30);
        int startY = (int)(height *.30);
        int ovalWidth = (int)(width*.4);
        int ovalHeight = (int)(height*.4);
        
        g.setColor(Color.RED);
        g.drawOval(startX, startY, ovalWidth, ovalHeight);
        g.fillOval(startX, startY, ovalWidth, ovalHeight);
    }
}
