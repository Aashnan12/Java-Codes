import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WinEvent extends Frame implements WindowListener {

    WinEvent() {
        Label l = new Label("Name");
        TextField tf = new TextField(10);
        Button b = new Button("Click me");
        add(l);
        add(tf);
        add(b);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        addWindowListener(this);
    }


    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        dispose();
        System.out.println("Window is Closed");
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    public static void main(String[] args) {
        WinEvent obj = new WinEvent();
    }
}
