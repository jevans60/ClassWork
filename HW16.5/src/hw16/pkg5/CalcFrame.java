
package hw16.pkg5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcFrame extends JFrame
{
    double amount;
    double rate;
    double years;
    double futureValueCalc;
    NumberFormat amountFormat;
    NumberFormat yearFormat;
    NumberFormat rateFormat;
    NumberFormat valueFormat;
   
    JFormattedTextField jtfAmount = new JFormattedTextField(amountFormat);
    JFormattedTextField jtfYears = new JFormattedTextField(yearFormat);
    JFormattedTextField jtfRate = new JFormattedTextField(rateFormat);
    JFormattedTextField jtfValue = new JFormattedTextField(valueFormat);
    
    CalcFrame()
    {
        setTitle("Future Value Calculator");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
                
        setLayout(new GridLayout(5, 2));
        Formats();
        
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel investAmount = new JLabel(" Investment Amount");
        jtfAmount.setColumns(20);
        p1.add(investAmount);
        p1.add(jtfAmount);
        
        
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel years = new JLabel("Years                           ");
        jtfYears.setColumns(20);
        p2.add(years);
        p2.add(jtfYears);
        
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel annualInterestRate = new JLabel("Annual Interest Rate");
        jtfRate.setColumns(20);
        p3.add(annualInterestRate);
        p3.add(jtfRate);
        
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel futureValue = new JLabel("Future Value               ");
        jtfValue.setColumns(20);
        p4.add(futureValue);
        p4.add(jtfValue);
        
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton calculate = new JButton("Calculate");
        p5.add(calculate);
        calculate.addActionListener(new CalculateButton());
       
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5, BorderLayout.SOUTH);
    }
    protected void Formats()
    {
        amountFormat = NumberFormat.getNumberInstance();
        yearFormat = NumberFormat.getNumberInstance();
        rateFormat = NumberFormat.getNumberInstance();
        valueFormat = NumberFormat.getNumberInstance();
    }
    
    public void propertyChange(PropertyChangeEvent e)
    {
        Object source = e.getSource();
        if (source == jtfAmount) {
            amount = ((Number)jtfAmount.getValue()).doubleValue();
        } else if (source == jtfRate) {
            rate = ((Number)jtfRate.getValue()).doubleValue();
        } else if (source == jtfYears) {
            years = ((Number)jtfYears.getValue()).intValue();
        }
    }
 
    class CalculateButton implements ActionListener
    {   
        @Override
        public void actionPerformed(ActionEvent e) 
            {
                futureValueCalc = (amount * (1 + 
                        rate) * (years * 12));
                
                jtfValue.setValue(futureValueCalc);
                jtfValue.repaint();
                
            }        
    }
    
}
