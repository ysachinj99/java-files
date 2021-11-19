import java.awt.*;
import java.awt.event.*;
public class Operationawt extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
TextField t1,t2;
Operationawt()
{
	Frame f=new Frame("AWT Arithematic Operation Prg");
	
	Label l1=new Label(" First no");
	TextField t1=new TextField();
	
	Label l2=new Label(" Second no");
	TextField t2=new TextField();
	
	Label l3=new Label("Result");
	TextField t3=new TextField();
	
	Button b1=new Button(" Add");
	Button b2=new Button(" Sub");
	Button b3=new Button(" Mul");
	Button b4=new Button(" Div");

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
l3.setBounds(55,180,100,20);

t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);

b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
b4.setBounds(230,250,50,20);

f.add(l1);
f.add(l2);
f.add(l3);

f.add(t1);
f.add(t2);
f.add(t3);

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);

f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
int d=0,f=0,g=0;
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=0;
if(e.getSource().equals (b1))
{
c=a+b;
System.out.println("Msg is  :" +c);
}
if(e.getSource()==b2)
{
d=a-b;
System.out.println("Msg is  :" +d);
}
if(e.getSource()==b3)
{
f=a*b;
System.out.println("Msg is  :" +f);
}
if(e.getSource()==b4)
{
g=a/b;
System.out.println("Msg is  :" +g);
}
}
public static void main(String args[])
{
Operationawt o=new Operationawt();
}	
}
