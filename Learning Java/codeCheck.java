import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class NegativeException extends Exception {
    private double num;

    public NegativeException(double num) {
        super("Exception occurred ....");
        this.num = num;
    }

    public double getAmount() {
        return num;
    }
}

class codeCheck extends JFrame implements ActionListener {
    private JLabel label, ans;
    private JTextField field;
    private JButton extract;

    codeCheck() {
        setTitle("My Frame");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Input Number");
        add(label);

        field = new JTextField(10);
        add(field);

        extract = new JButton("Enter");
        extract.addActionListener(this);
        add(extract);

        ans = new JLabel();
        add(ans);

        setVisible(true);
    }

    public int factorial(int x) throws NegativeException {
        int f = 1;
        if (x < 0) {
            throw new NegativeException(x);
        } else {
            while (x > 0) {
                f = f * x;
                x = x - 1;
            }
        }
        return f;
    }

    public void actionPerformed(ActionEvent e) {
        String val = field.getText();
        try {
            int num = Integer.parseInt(val);
            int f = factorial(num);
            ans.setText("Factorial is: " + f);
        } 
        catch (NumberFormatException ex) {
            ans.setText("Invalid Input: Please enter a valid number.");
        } 
        catch (NegativeException ex) {
            ans.setText("Invalid Input: Number should be non-negative.");
        }
    }

    public static void main(String[] args) {
        new codeCheck();
    }
}
