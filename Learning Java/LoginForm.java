import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("User-Name");
    JLabel l2 = new JLabel("PassWord");
    JTextField tf1 = new JTextField(20);
    JTextField tf2 = new JTextField(20);
    JTextField tf3 = new JTextField(20);
    JButton b = new JButton("Login");

    LoginForm(){
        setTitle("login Page");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b);
        add(tf3);
        setLayout(new FlowLayout());
        setSize(350,300);
        setVisible(true);
        b.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        if(s1.equals("anshu") && s2.equals("123")){
            tf3.setText("Login Success");
        }
        else{
            tf3.setText("Login Failure");
        }
        
    }



    public static void main(String[] args) {
        LoginForm obj = new LoginForm();
    }
}
