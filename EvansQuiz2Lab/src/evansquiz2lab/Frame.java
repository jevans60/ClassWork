
package evansquiz2lab;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import javax.swing.JTextArea;
import java.io.*;
import javax.swing.JScrollBar;

public class Frame extends JFrame
{
    String fileName = "c:\\testfile.txt";
    JTextArea textArea = new JTextArea(); 
    Font defaultFont = textArea.getFont();
                
   Frame()
    {   
        setTitle("Evans Quiz2 Lab1");
        setSize(600, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);   

        JPanel p1 = new JPanel();
        textArea.setRows(30);
        textArea.setColumns(60);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(true);
        textArea.setFont(defaultFont);
        p1.add(textArea);
                     
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0, 3));
        JButton verdana = new JButton("SetVerdana");
        JButton times = new JButton("SetTimes");
        JButton def = new JButton("SetDefault");
        JButton textBinary = new JButton("SaveTextBinary");
        JButton showBinary = new JButton("ShowBinary");
        JButton showText = new JButton("ShowText");
        
        p.add(verdana);
        p.add(times);
        p.add(def);
        p.add(textBinary);
        p.add(showBinary);
        p.add(showText); 
        add(p1, BorderLayout.NORTH);
        add(p, BorderLayout.SOUTH);
        
        verdana.addActionListener(new VerdanaButton());
        times.addActionListener(new TimesButton());
        def.addActionListener(new DefaultButton());
        textBinary.addActionListener(new SaveTextBinaryButton());
        showBinary.addActionListener(new ShowBinaryButton());
        showText.addActionListener(new ShowSavedTextButton());
        
    }
        
        class VerdanaButton implements ActionListener
        {   
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    Font font = new Font("Verdana", Font.BOLD,12);
                    textArea.setFont(font);
                    textArea.repaint();
                }        
        }
        
        class TimesButton implements ActionListener
        {
        @Override
            public void actionPerformed(ActionEvent e) 
            {
                Font font1 = new Font("Times New Roman", Font.ITALIC,20);
                textArea.setFont(font1);
                textArea.repaint();
            }
        }
        
        class DefaultButton implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                 textArea.setFont(defaultFont);
                 textArea.repaint();
            }
        }
        
        class SaveTextBinaryButton implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    DataOutputStream output =
                            new DataOutputStream(new FileOutputStream(fileName));
                    {
                    output.writeUTF(textArea.getText());
                    output.close();
                    }
                } catch (FileNotFoundException ex) 
                {
                    System.out.println("This file does not exist!");
                } catch (IOException ex) 
                { 
                    System.out.println("Error reading/writing file!");
                }
            }
        }
        
        class ShowBinaryButton implements ActionListener
        {
// Did not figure out how to do this.... but I can read from the file...
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            try {
                DataInputStream fileInput =
                        new DataInputStream(new FileInputStream(fileName));

                String info = fileInput.toString();
                System.out.println(info);
                
                textArea.append(info);
                textArea.repaint();
                fileInput.close();
                } catch (FileNotFoundException ex) 
            {
                System.out.println("This file does not exist!");
            } catch (IOException ex) 
            {
               System.out.println("Error reading/writing file!");
            }
        }
        }
        
        class ShowSavedTextButton implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                DataInputStream fileInput =
                        new DataInputStream(new FileInputStream(fileName));

                String text = fileInput.readUTF();
                System.out.println(text);
                textArea.append(text);
                textArea.repaint();
                fileInput.close();
                } catch (FileNotFoundException ex) 
            {
                System.out.println("This file does not exist!");
            } catch (IOException ex) 
            {
               System.out.println("Error reading/writing file!");
            }
        }
        }
}