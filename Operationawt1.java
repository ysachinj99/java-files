import java.awt.*;
import java.awt.event.*;
public class Operationawt1 extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
TextField t1,t2;
Operationawt1()
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
public void actionPerformed(ActionEvent e) {    
String s1 = t1.getText();    
String s2 = t2.getText();    

int a = Integer.parseInt(s1);    
int b = Integer.parseInt(s2);    
int c = 0;    
if (e.getSource() == b1){    
   c = a + b;    
}  
else if (e.getSource() == b2){    
   c = a - b;    
}    
String result = String.valueOf(c);    
t3.setText(result);    
  }   