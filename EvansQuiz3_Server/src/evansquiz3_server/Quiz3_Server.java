
package evansquiz3_server;


import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Quiz3_Server extends JFrame
{
     private JTextArea jta = new JTextArea();
     

     public Quiz3_Server() 
     {
    
        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);

        setTitle("Quiz 3_Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try 
        {
             ServerSocket serverSocket = new ServerSocket(8000);
             jta.append("Server started at " + new Date() + '\n');

             Socket socket = serverSocket.accept();

             DataInputStream inputFromClient = new DataInputStream(
                socket.getInputStream());
             DataOutputStream outputToClient = new DataOutputStream(
                socket.getOutputStream());
             
             while(true)
             {
                 double rateInput = inputFromClient.readDouble();
                 jta.append("Annual Interest Rate from Server is: " + rateInput);
                 
                 int yearInput = inputFromClient.readInt();
                 jta.append("\nNumber of Years from Client is: " + yearInput);
                 
                 double amountInput = inputFromClient.readDouble();
                 jta.append("\nLoan Amount from Client: " + amountInput);
                 
                 double monthlyRate = rateInput / 1200;
                 double monthlyPayment = (amountInput * monthlyRate) / (1 - 
                    (1 / Math.pow(1+ monthlyRate, yearInput * 12)));
                double totalPayment = monthlyPayment * yearInput * 12;
                
                jta.append("\nMonthly Payment: " + monthlyPayment);
                jta.append("\nTotal Payment: " + totalPayment);
               
                outputToClient.writeDouble(monthlyPayment);
                outputToClient.writeDouble(totalPayment);
             }
        }
        catch(IOException ex) 
        {
            System.err.println(ex);
        }
  }
}