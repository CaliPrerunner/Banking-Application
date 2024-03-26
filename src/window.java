import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//find the customer by id
// then display the customer info

public class window implements ActionListener {

    JFrame mainWindow = new JFrame();

    JButton find = new JButton("Search");
    JButton employeeLoginBUTT = new JButton("Employee Login");
    JButton customerLoginBUTT = new JButton("Customer Login");
    JTextField userInput = new JTextField(10);
    CardLayout layout = new CardLayout();

    JPanel homePanel = new JPanel();
    JPanel customerLoginPanel = new JPanel();
    JPanel employeeLoginPanel = new JPanel();


    //JPanel custLogin = new JFrame("Customer Login");


    JTextArea output = new JTextArea();



    public void startGUI(){


        mainWindow.setTitle("Welcome");//Setting title of JFrame
        mainWindow.getContentPane().setLayout(null);//Setting Layout
        mainWindow.setBounds(200, 200, 400, 500);
        mainWindow.setVisible(true);//Setting visibility
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation


        homePanel.setVisible(true);//Setting visibility
        homePanel.setBounds(200, 200, 400, 500);//Setting Location and Size
        homePanel.add(customerLoginBUTT);
        homePanel.add(employeeLoginBUTT);
        customerLoginBUTT.setBounds(60, 100, 140, 30);
        employeeLoginBUTT.setBounds(200, 100, 140, 30);
        customerLoginBUTT.addActionListener(customerLoginPage);
        employeeLoginBUTT.addActionListener(employeeLoginPage);

        mainWindow.add(homePanel );




//employee home page
        /*
        mainWindow.add(find);
        find.setBounds(300, 100, 100, 30);
        find.addActionListener(findCustomer);
        mainWindow.add(userInput);
        userInput.setBounds(100,100,200,30);
        output.setBounds(100,150,200,200);
        mainWindow.add(output);
        output.setWrapStyleWord(true);
        output.setLineWrap(true);
        output.setEditable(false);

         */

    }
    ActionListener employeeLoginPage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          mainWindow.remove(homePanel);
          mainWindow.add(employeeLoginPanel);
            employeeLoginPanel.setBounds(50,50,300,300);
            employeeLoginPanel.setVisible(true);

            JButton backButt = new JButton("Back");
            customerLoginPanel.add(backButt);
            backButt.setBounds(100, 100, 100, 30);
            backButt.addActionListener(backToHomePage);

        }
    };
    //action listener used to find the user
    ActionListener findCustomer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //window looks logic

            //print customer logic
            customer c = new customer();
            String input = userInput.getText();
            int id = Integer.parseInt(input);
           custDAO cust = new custDAO();
            try {
                 c = cust.get(id);
            } catch (SQLException ex) {throw new RuntimeException(ex);}
            c.printCustomerDetails();
            output.setText(c.getCustomerDetails());
        }
    };

    ActionListener customerLoginPage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customerLoginPanel.setLayout(null);//Setting Layout
            mainWindow.remove(homePanel);
            mainWindow.add(customerLoginPanel);
            customerLoginPanel.setBounds(50,50,300,300);
            customerLoginPanel.setVisible(true);

            JButton backButt = new JButton("Back");
            customerLoginPanel.add(backButt);
            backButt.setBounds(100, 100, 100, 30);
            backButt.addActionListener(backToHomePage);




        }
    };

    //brings homepage back to visilbe and dispose current widow
    ActionListener backToHomePage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customerLoginPanel.setVisible(false);
            mainWindow.add(homePanel);
        }
    };
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
