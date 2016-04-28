
package hw13.pkg7;
import java.awt.GridLayout;
import javax.swing.*;

public class TicTacToe extends JFrame
{
    public TicTacToe()
    {
        setTitle("Random TicTacToe");
        setLayout(new GridLayout(3,0,2,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
        
        for(int i=0; i<9; i++)
        {
            // need rand 0-3
            int val = (int)(Math.random()*3);
            add(new TicTacToePanel(val));
        } 
    }
}
