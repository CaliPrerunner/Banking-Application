import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//find the customer by id
// then display the customer info

public class window implements ActionListener {

    JFrame mainWindow = new JFrame();
    JPanel cards = new JPanel(new CardLayout());
    JPanel homePage = new JPanel();

    JButton find = new JButton("Search");
    JButton employeeLoginBUTT = new JButton("Employee Login");
    JButton customerLoginBUTT = new JButton("Customer Login");
    JTextField userInput = new JTextField(10);
    //JPanel custLogin = new JFrame("Customer Login");


    JTextArea output = new JTextArea();



    public void startGUI(){

        //workds but fidure out the sixing and how to make the sixing dynamic

        mainWindow.setTitle("Welcome");//Setting title of JFrame
        mainWindow.getContentPane().setLayout(null);//Setting Layout
        mainWindow.setVisible(true);//Setting visibility
        mainWindow.setBounds(200, 200, 400, 500);//Setting Location and Size
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
        mainWindow.add(customerLoginBUTT);
        mainWindow.add(employeeLoginBUTT);
        customerLoginBUTT.setBounds(100, 100, 140, 30);
        employeeLoginBUTT.setBounds(210, 100, 140, 30);
        customerLoginBUTT.addActionListener(customerLoginPage);



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
            CardLayout cl = (CardLayout) cards.getLayout();
            cl.show(cards, "Customer Login");
            mainWindow.revalidate();
            mainWindow.repaint();

            JButton backButt = new JButton("Back");
            mainWindow.add(backButt);
            backButt.setBounds(100, 100, 100, 30);
            backButt.addActionListener(backToHomePage);


        }
    };
    //brings homepage back to visilbe and dispose current widow
    ActionListener backToHomePage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
