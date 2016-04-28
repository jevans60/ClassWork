
package hw13.pkg9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


class ArcsPanel extends JPanel 
{
    int width = getWidth();
    int height = getHeight();
    
  @Override
  protected void paintComponent(Graphics g) 
  {
    super.paintComponent(g);
   
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    int x = xCenter - radius;
    int y = yCenter - radius;

    g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
    
    g.setColor(Color.BLACK);
    g.drawOval(8, 14, 100, 100);
    
   
  }
  @Override
        public Dimension getPreferredSize() {
            return new Dimension(100, 100);
        }
}
