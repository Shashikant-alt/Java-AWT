import java.awt.*;

class test
{
    test()
    {
    Frame f= new Frame("Using FLowLayout Manager");
    Panel p= new Panel();
    p.setBounds(50,100,200,200);
    FlowLayout g= new FlowLayout();
    p.setLayout(g);
    p.add(new Button("Button 1"));
    p.add(new Button("Button 2"));
    p.add(new Button("Button 3"));
    p.add(new Checkbox("Tick 1"));
    p.add(new Checkbox("Tick 2"));
    p.add(new Checkbox("Tick 3"));
    p.add(new TextField("Box1"));
    p.add(new TextField("Box2"));
    p.add(new TextField("Box3"));
    p.add(new Label("Label1"));
    p.add(new Label("Label2"));
    p.add(new Label("Label3"));
    f.add(p);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
}
public class Program56 {
    public static void main(String[] args) {
        test t = new test();
    }
}
