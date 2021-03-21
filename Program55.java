import java.awt.*;
class test
{
    test()
    {
    Frame f= new Frame("Using GridLayout Manager");
    Panel p= new Panel();
    p.setBounds(100,100,200,200);
    GridLayout g= new GridLayout(2,2);
    p.setLayout(g);
    p.add(new Button("Button"));
    p.add(new Checkbox("Tick"));
    p.add(new TextField("Textfield"));
    p.add(new Label("Hello"));
    f.add(p);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
}
public class Program55 {
    public static void main(String[] args) {
        test t= new test();
    }
}
