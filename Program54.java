import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Program54 implements ActionListener{
    final Label ft= new Label();
    Program54()
    {
        Frame f= new Frame("Registration Form");
        TextField t1,t2,t3;  
        Label l1,l2;  
        l1=new Label("Student Details");  
        l1.setBounds(120,40,100,20);  
        l2=new Label("Languages Known");  
        l2.setBounds(110,150,100,20);  
        f.add(l1); 
        f.add(l2);  
        Label l3= new Label("Name:");
        l3.setBounds(50,70,100,20);
        f.add(l3);
        t1=new TextField("Insert text");  
        t1.setBounds(200,70,100,20);
        Label l4= new Label("Class:");
        l4.setBounds(50,90,100,20);
        f.add(l4);
        t2=new TextField("Insert text");  
        t2.setBounds(200,90,100,20); 
        Label l5= new Label("Enrollment:");
        l5.setBounds(50,110,100,20);
        f.add(l5);
        t3=new TextField("Insert text");  
        t3.setBounds(200,110,100,20); 
        f.add(t1); 
        f.add(t2); 
        f.add(t3);
        Checkbox c1= new Checkbox("C++");
        Checkbox c2= new Checkbox("Java");
        Checkbox c3= new Checkbox("PHP");
        Checkbox c4= new Checkbox("Python");
        c1.setBounds(100,180,50,20);
        c2.setBounds(100,210,50,20);
        c3.setBounds(190,180,50,20);
        c4.setBounds(190,210,50,20);
        f.add(c2);
        f.add(c1);
        f.add(c4);
        f.add(c3);
        ft.setBounds(130,260,70,20);
        Button b=new Button("Submit");
        b.setBounds(125,240,70,20);  
        b.addActionListener(this);
        f.add(b);  
        f.add(ft);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){  
            ft.setText("Registered");  
}
    public static void main(String[] args) {
        Program54 p= new Program54();
    }
    
}
