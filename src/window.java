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
    JButton backButtCust = new JButton("Back");
    JButton backButtEmp = new JButton("Back");
    JButton loginBUTT = new JButton("Login");
    JTextField userInput = new JTextField(10);
    JTextField emploginInputU = new JTextField(10);
    JTextField emploginInputP = new JTextField(10);
    CardLayout layout = new CardLayout();

    JPanel homePanel = new JPanel();
    JPanel customerLoginPanel = new JPanel();
    JPanel employeeLoginPanel = new JPanel();
    JFrame employeeViewPanel = new JFrame();

    JLabel findcustL = new JLabel("Find Customer by customer ID");


    //JPanel custLogin = new JFrame("Customer Login");


    JTextArea output = new JTextArea();



    public void startGUI(){


        mainWindow.setTitle("Welcome");//Setting title of JFrame
        mainWindow.getContentPane().setLayout(null);//Setting Layout
        mainWindow.setBounds(200, 200, 700, 700);
        mainWindow.setVisible(true);//Setting visibility
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation


        homePanel.setVisible(true);//Setting visibility
        homePanel.setBounds(0, 200, 400, 500);//Setting Location and Size
        employeeLoginPanel.setBounds(0,0,500,500);
        homePanel.add(customerLoginBUTT);
        homePanel.add(employeeLoginBUTT);
        mainWindow.add(homePanel);
        customerLoginBUTT.setBounds(60, 100, 140, 30);
        employeeLoginBUTT.setBounds(200, 100, 140, 30);

        //main log in page
        backButtCust.setBounds(50, 100, 100, 30);
        backButtEmp.setBounds(50, 100, 100, 30);
        customerLoginBUTT.addActionListener(customerLoginPage);
        employeeLoginBUTT.addActionListener(employeeLoginPage);
        backButtCust.addActionListener(backToHomePagecust);
        backButtEmp.addActionListener(backToHomePageEmp);
        employeeLoginPanel.add(backButtEmp);
        customerLoginPanel.add(backButtCust);
        mainWindow.add(employeeLoginPanel);
        mainWindow.add(customerLoginPanel);



        //employee login
       employeeViewPanel.setBounds(200, 200, 700, 700);
        employeeViewPanel.getContentPane().setLayout(null);//Setting Layout

        employeeViewPanel.setVisible(false);
        employeeLoginPanel.setVisible(false);
        emploginInputU.setBounds(100,500,200,30);
        emploginInputP.setBounds(100,20,200,30);
        loginBUTT.setBounds(300, 100, 100, 30);
        loginBUTT.addActionListener(employeeView);
        employeeLoginPanel.add(loginBUTT);
        employeeLoginPanel.add(emploginInputU);
        employeeLoginPanel.add(emploginInputP);

        employeeViewPanel.add(userInput);
        employeeViewPanel.add(output);
        employeeViewPanel.add(find);
        employeeViewPanel.add(findcustL);
        findcustL.setBounds(100,50,300,30);
        find.setBounds(300, 100, 100, 30);
        find.addActionListener(findCustomer);
        userInput.setBounds(100,100,200,30);
        output.setBounds(100,150,200,200);
        output.setWrapStyleWord(true);
        output.setLineWrap(true);
        output.setEditable(false);






    }
    ActionListener employeeView = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String ID = emploginInputU.getText();
            int id = Integer.parseInt(ID);
            String pass = emploginInputP.getText();

            empDAO emp = new empDAO();
            employee ep = new employee();
            try {
                ep = emp.get(id);
            } catch (SQLException ex) {throw new RuntimeException(ex);}
            if(ep.getPass().equals(pass)){
                employeeLoginPanel.setVisible(false);
                mainWindow.revalidate();
                mainWindow.repaint();
                employeeViewPanel.setVisible(true);
            }


        }
    };
    ActionListener employeeLoginPage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customerLoginPanel.setLayout(null);//Setting Layout
            homePanel.setVisible(false);
            employeeLoginPanel.setVisible(true);



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
            homePanel.setVisible(false);
            customerLoginPanel.setLayout(null);//Setting Layout
            customerLoginPanel.setBounds(50,50,300,300);
            customerLoginPanel.setVisible(true);






        }
    };

    //brings homepage back to visilbe and dispose current widow
    ActionListener backToHomePagecust = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customerLoginPanel.setVisible(false);
            homePanel.setVisible(true);
        }
    };
     ActionListener backToHomePageEmp = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            employeeLoginPanel.setVisible(false);
            homePanel.setVisible(true);



        }
    };
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
