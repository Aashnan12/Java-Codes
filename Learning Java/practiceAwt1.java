import java.awt.*;
public class practiceAwt1 {
    public static void main(String[] args) {
        Frame f = new Frame("First Frame");
        Label l = new Label("Name");
        TextField tf = new TextField(10);
        Button b = new Button("Click me");
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setLayout(new FlowLayout()); // Readability + look and feel good
        f.setSize(400,400);
        f.setVisible(true);
    }
}
