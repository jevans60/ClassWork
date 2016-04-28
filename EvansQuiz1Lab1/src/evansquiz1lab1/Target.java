
package evansquiz1lab1;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class Target extends JFrame
{
    public Target()
    {
        setTitle("EvansQuiz1Lab1");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
        
        add(new DrawTarget());
    }
}
