
package hw13.pkg22;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;


class OctagonPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        // Create a Polygon object
        Polygon oct = new Polygon();

        // Add points to the polygon
        oct.addPoint(xCenter + radius, yCenter);
        oct.addPoint((int)(xCenter + radius *
            Math.cos(2 * Math.PI / 6)), (int)(yCenter - radius *
            Math.sin(2 * Math.PI / 6)));
        oct.addPoint((int)(xCenter + radius *
            Math.cos(2 * 2 * Math.PI / 6)), (int)(yCenter - radius *
            Math.sin(2 * 2 * Math.PI / 6)));
        oct.addPoint((int)(xCenter + radius *
            Math.cos(3 * 2 * Math.PI / 6)), (int)(yCenter - radius *
            Math.sin(3 * 2 * Math.PI / 6)));
        oct.addPoint((int)(xCenter + radius *
            Math.cos(4 * 2 * Math.PI / 6)), (int)(yCenter - radius *
            Math.sin(4 * 2 * Math.PI / 6)));
        oct.addPoint((int)(xCenter + radius *
            Math.cos(5 * 2 * Math.PI / 6)), (int)(yCenter - radius *
            Math.sin(5 * 2 * Math.PI / 6)));

        g2.setFont(new Font("Arial", Font.BOLD,40));
        FontMetrics fm = g.getFontMetrics();

        int stringWidth = fm.stringWidth("STOP");
        int stringAscent = fm.getAscent();

        int xCoord = (getWidth() / 2) - (stringWidth / 2);
        int yCoord = (getHeight() / 2) + (stringAscent / 2);
            
        g.setColor(Color.RED);
        g.drawPolygon(oct);
        g.fillPolygon(oct);
        g2.setColor(Color.WHITE);
        
        g2.drawString("STOP", xCoord, yCoord);


        
    }
}
