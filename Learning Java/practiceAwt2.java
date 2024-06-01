import java.awt.*;

public class practiceAwt2 extends Frame{
    practiceAwt2(){
        Label l = new Label("Name");
        TextField tf = new TextField(10);
        Button b = new Button("Click me");
        add(l);
        add(tf);
        add(b);
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args){
        practiceAwt2 obj = new practiceAwt2();
    }
}