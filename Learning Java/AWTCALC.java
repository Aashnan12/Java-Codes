import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWTCALC extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Number 1 : ");
    JTextField tf1 = new JTextField(20);
    JLabel l2 = new JLabel("Number 2 : ");
    JTextField tf2 = new JTextField(20);
    JLabel l3 = new JLabel("Result : ");
    JTextField res = new JTextField(20);
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Sub");
    JButton b3 = new JButton("Mul");
    JButton b4 = new JButton("Div");

    AWTCALC(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,250);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(res);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf1.getText());
        
        if(e.getSource() == b1){
            res.setText(String.valueOf(num1 + num2));
        }
        if(e.getSource() == b2){
            res.setText(String.valueOf(num1 - num2));
        }
        if(e.getSource() == b3){
            res.setText(String.valueOf(num1 * num2));
        }
        if(e.getSource() == b4){
            res.setText(String.valueOf(num1 / num2));
        }
    }

    public static void main(String[] args) {
        AWTCALC obj = new AWTCALC();
    }


}
