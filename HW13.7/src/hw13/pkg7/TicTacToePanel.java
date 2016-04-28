
package hw13.pkg7;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel extends JPanel
{
    public static final int BLANK = 0;
    public static final int DRAWX = 1;
    public static final int DRAWO = 2;
    
    private int currentShape;
    
    TicTacToePanel()
    {
    }
    
    TicTacToePanel(int shape)
    {
      currentShape = shape;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        switch(currentShape){
            case DRAWX:
                drawX(g);
                break;
            case DRAWO:
                drawO(g);
                break;
            case BLANK:
            default:
                break;
        }
    }
    
    private void drawO(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        int startX = (int)(width*.15);
        int startY = (int)(height *.15);
        int ovalWidth = (int)(width*.7);
        int ovalHeight = (int)(height*.7);
        
        g.drawOval(startX, startY, ovalWidth, ovalHeight);
    }
    
    private void drawX(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();
        
        int startX = (int)(width*.15);
        int startY = (int)(height *.15);
        int endX = (int)(width*.85);
        int endY = (int)(height *.85);
        
        g.drawLine(startX, startY, endX, endY);
        g.drawLine(endX, startY, startX, endY);
    }
}
