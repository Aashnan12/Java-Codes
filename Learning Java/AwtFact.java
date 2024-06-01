import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AwtFact extends JFrame implements ActionListener{

    JLabel l = new JLabel("Enter Number");
    JTextField tf = new JTextField(20);
    JButton b = new JButton("Fact");
    JTextField res = new JTextField(20);
    
    AwtFact(){
        setSize(390,200);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
        add(res);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(tf.getText());
        try{
            if(num < 0){
                throw new MyException("Number is -ve");
            }
            else{
                int fact = 1;
                for(int i=1;i<=num;i++){
                    fact *= i;
                }
                res.setText(String.valueOf(fact));
            }
        }
        catch(MyException ex){
            res.setText(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        AwtFact obj = new AwtFact();
    }
}

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
