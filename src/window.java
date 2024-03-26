import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//find the customer by id
// then display the customer info

public class window implements ActionListener {

    JFrame frame = new JFrame();
    JButton find = new JButton("Search");
    JTextField userInput = new JTextField(10);
    JPanel panel = new JPanel();
    JLabel output = new JLabel();


    public void startGUI(){

        //workds but fidure out the sixing and how to make the sixing dynamic

        frame.setTitle("Find Customer");//Setting title of JFrame
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.setVisible(true);//Setting visibility
        frame.setBounds(200, 200, 400, 500);//Setting Location and Size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
        frame.add(find);
        find.setBounds(130, 350, 200, 40);
        find.addActionListener(findCustomer);
        frame.add(userInput);
        frame.add(panel);
        panel.add(userInput);
        panel.add(find);
        panel.setBounds(50,50,300,200);
        userInput.setBounds(100,100,200,30);
        output.setBounds(100,50,200,300);
        frame.add(output);
        panel.add(output);
    }
    //action listener used to find the user
    ActionListener findCustomer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
