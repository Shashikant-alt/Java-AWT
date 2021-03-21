import java.awt.*;

class test
{
    test()	
    {
    Frame f= new Frame("Using BorderLayout Manager");
    Panel p= new Panel();
    p.setBounds(100,100,300,300);
    BorderLayout g= new BorderLayout();
    p.setLayout(g);
    p.add(new Button("North"),BorderLayout.NORTH);
    p.add(new Button("South"),BorderLayout.SOUTH);
    p.add(new TextField("Test Field East"),BorderLayout.EAST);
    p.add(new TextField("Text Feild West"),BorderLayout.WEST);
    p.add(new Label("Centre Label"),BorderLayout.CENTER);
    f.add(p);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
}
public class Program57 {
    public static void main(String[] args) {
        test t= new test();
    }    
}
