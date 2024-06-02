import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcAwtException extends JFrame implements ActionListener {

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

    CalcAwtException(){
        setLayout(new FlowLayout());
        setSize(300,250);
        setVisible(true);
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

    public void actionPerformed(ActionEvent event){
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());

        if(event.getSource() == b1){
            res.setText(String.valueOf(num1 + num2));
        }
        if(event.getSource() == b2){
            res.setText(String.valueOf(num1 - num2));
        }
        if(event.getSource() == b3){
            res.setText(String.valueOf(num1 * num2));
        }
        if(event.getSource() == b4){
            if(num2 == 0){
                try {
                    throw new Exception("Divide By Zero Exception");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    res.setText(e.getMessage());
                }
            }
            else{
                res.setText(String.valueOf(num1/num2));
            }
        }
    }
    
    public static void main(String[] args) {
        CalcAwtException obj = new CalcAwtException();
    }
}
