import java.awt.*;
import java.awt.event.*;
 
public class SQRCube implements ActionListener
{
//Declaring Objects
Frame f=new Frame();
Label l1=new Label("First Number");
Label l2=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("Sqr");
Button b2=new Button("Cube");
Button b3=new Button("Cancel");
SQRCube()
{
//Giving Coordinates
l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
//Adding components to the frame
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
if(e.getSource()==b1)
{
t2.setText(String.valueOf(n1*n1));
}
if(e.getSource()==b2)
{
t2.setText(String.valueOf(n1*n1*n1));
}
if(e.getSource()==b3)
{
System.exit(0);
}
}
public static void main(String...s)
{
new SQRCube();
}
}