
package evansquiz3lab;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Quiz3_Client extends JFrame
{
    JTextArea textArea = new JTextArea(); 
    JScrollBar vert = new JScrollBar(JScrollBar.VERTICAL);
    JTextField air = new JTextField();
    JTextField noy = new JTextField();
    JTextField la = new JTextField();
    
    String annualInterestRateString = "Annual Interest Rate: ";
    String numberOfYearsString = "Number of Years: ";
    String loanAmountString = "Loan Amount: ";
    String monthlyPaymentString = "Monthly Payment: ";
    String totalPaymentString = "Total Payment: ";
    
    private DataInputStream fromServer;
    private DataOutputStream toServer;
    
    Quiz3_Client()
    {
    setTitle("Quiz 3 Client");
    setSize(300, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);  
    pack();
    try 
    {
      
      Socket socket = new Socket("localhost", 8000);

      fromServer = new DataInputStream(
        socket.getInputStream());

      toServer =
        new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) 
    {
      textArea.append(ex.toString() + '\n');
    }
  
    
    
    JPanel p1 = new JPanel(new GridLayout(4,0));
    JLabel annualInterestRate = new JLabel("Annual Interest Rate");
    p1.add(annualInterestRate);
    air.setColumns(10);
    p1.add(air);
    
    JLabel numberOfYears = new JLabel("Number of Years");
    p1.add(numberOfYears);
    noy.setColumns(10);
    p1.add(noy);
    
    JLabel loanAmount = new JLabel("Loan Amount");
    p1.add(loanAmount);
    la.setColumns(10);
    p1.add(la);
    
    
    JPanel p2 = new JPanel();
    JButton submit = new JButton("Submit");
    p2.add(submit);
    submit.addActionListener(new ButtonListener());
    
    JPanel p3 = new JPanel();
    textArea.setRows(5);
    textArea.setColumns(25);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(true);
    
    
    p3.add(textArea);
    p3.add(vert);
    
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.EAST);
    add(p3, BorderLayout.SOUTH);
    
    }
    
    private class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            try
            {
            double interestRate = Double.parseDouble(air.getText().toString());
            toServer.writeDouble(interestRate);
            String interest = air.getText();
                        
            int years = Integer.parseInt(noy.getText());
            toServer.writeInt(years);
            String year = noy.getText();

            double amount = Double.parseDouble(la.getText());
            toServer.writeDouble(amount);
            String lamount = la.getText();
            
            double monthlyPayment = fromServer.readDouble();
            double totalPayment = fromServer.readDouble();
            
            textArea.setText(annualInterestRateString + interest + "\n" 
                    + numberOfYearsString + year + "\n" 
                    + loanAmountString + lamount + "\n" 
                    + monthlyPaymentString + monthlyPayment + "\n" 
                    + totalPaymentString + totalPayment); 
            
            
//                    +  
//                    + monthlyPaymentString + monthlyPayment  + "\n"
//                    + 
           } 
            catch (IOException ex)
            {
                System.err.println(ex);
            }
    
        }
    }
}
    
    

