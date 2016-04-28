
package evansquiz4lab;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

    
public class Calendar extends JFrame
{
    //global variables and such
    int currentYear;
    int currentMonth;
    int gregYear;
    int gregMonth;
    int gregDay;
    JLabel month = new JLabel("January");
    JLabel year = new JLabel("Choose Year");
    JComboBox comboYear = new JComboBox();
    JButton previous = new JButton("<--");
    JButton next = new JButton("-->");        
    DefaultTableModel calendarTable = new DefaultTableModel()
        {@Override
        public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};
    JTable calendar = new JTable(calendarTable);
    JScrollPane scrollCalendar = new JScrollPane(calendar);
    
    
    Calendar() 
    {
        JFrame calendarFrame = new JFrame();
        JPanel calendarPanel = new JPanel();
        
        setTitle("EvansQuiz4Lab");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
                
        //set up buttons and such
        calendarPanel.add(month);
        calendarPanel.add(year);
        calendarPanel.add(comboYear);
        calendarPanel.add(previous);
        calendarPanel.add(next);
        calendarPanel.add(scrollCalendar);
        calendarFrame.add(calendarPanel);

        //listeners
        previous.addActionListener(new buttonPrevious());
        next.addActionListener(new buttonNext());
        comboYear.addActionListener(new buttonComboYear());
        
        calendarPanel.setBounds(0, 0, 320, 335);
        month.setBounds(160 - month.getPreferredSize().width / 2, 25, 100, 25);
        year.setBounds(10, 305, 80, 20);
        comboYear.setBounds(230, 305, 80, 20);
        previous.setBounds(260, 25, 50, 25);
        next.setBounds(260, 25, 50, 25);
        scrollCalendar.setBounds(10, 50, 300, 250);
        
        //get date from Greg Cal
        GregorianCalendar cal = new GregorianCalendar();
        gregDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
        gregMonth = cal.get(GregorianCalendar.MONTH);
        gregYear = cal.get(GregorianCalendar.YEAR);
        currentMonth = gregMonth;
        currentYear = gregYear;
        
        String[] headers = {"Sunday", "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < 7; i++) 
        {
            calendarTable.addColumn(headers[i]);
        }
        
        //little details for calendar
        calendar.getParent().setBackground(calendar.getBackground());
        calendar.getTableHeader().setResizingAllowed(true);
        calendar.getTableHeader().setReorderingAllowed(false);
        calendar.setColumnSelectionAllowed(true);
        calendar.setRowSelectionAllowed(true);
        
        calendar.setRowHeight(38);
        calendarTable.setColumnCount(7);
        calendarTable.setRowCount(6);
        
        for (int i = gregYear - 100; i <= gregYear + 100; i++)
        {
            comboYear.addItem(String.valueOf(i));
        }
        
        refreshCalendar(gregMonth, gregYear);
    }

    private void refreshCalendar(int monthr, int yearr)
        {
            String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November",
                "December"};
            int numOfDays;
            int startOfMonth;
            
            previous.setEnabled(true);
            next.setEnabled(true);
            if (monthr == 0 && yearr <= gregYear - 10){previous.setEnabled(false);}
            if (monthr == 11 && yearr >= gregYear + 100){next.setEnabled(false);} 
            month.setText(months[monthr]); 
            month.setBounds(160 - month.getPreferredSize().width / 2, 25, 180, 25);
            comboYear.setSelectedItem(String.valueOf(yearr)); 
            
            //empty table
            for (int i = 0; i < 6; i++) 
            {
                for (int j = 0; j < 7; j++) 
                {
                    calendarTable.setValueAt(null, i, j);
                }
            }
            
            //get first day of month
            GregorianCalendar cal = new GregorianCalendar(yearr, monthr, 1);
            numOfDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            startOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);
            
            //show calendar
            for (int i = 1; i <= numOfDays; i++)
            {
                int row = new Integer((i + startOfMonth - 2) / 7);
                int column = (i + startOfMonth - 2) % 7;
                calendarTable.setValueAt(i, row, column);
            }
            
            calendar.setDefaultRenderer(calendarTable.getColumnClass(0), 
                    new calendarTableRenderer());
        }
    
    class calendarTableRenderer extends DefaultTableCellRenderer
    {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean selected, boolean focused, int row, int column)
        {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6)
            { 
                 setBackground(Color.LIGHT_GRAY);
            }
            else
            { 
                 setBackground(Color.DARK_GRAY);
            }
            
            if(value != null)
            {
                if (Integer.parseInt(value.toString()) == gregDay && 
                        currentMonth == gregMonth && currentYear == gregYear)
                {
                    setBackground(Color.BLUE);
                }
            }
            setBorder(null);
            setForeground(Color.BLACK);
            return this;
        }
    }
    
    class buttonPrevious implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
             if (currentMonth == 0)
             { 
                currentMonth = 11;
                currentYear -= 1;
             }
             else
             {
                currentMonth -= 1;
             }
             refreshCalendar(currentMonth, currentYear);
        }
    }
    
    class buttonNext implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if (currentMonth == 11)
            { 
                currentMonth = 0;
                currentYear += 1;
            }
            else
            {
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
    class buttonComboYear implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if (comboYear.getSelectedItem() != null)
            {
                String b = comboYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }
    }
    
    
}



