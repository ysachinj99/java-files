//Choice
import java.awt.*;
import java.awt.event.*;
public class ChoiceCls1 implements ActionListener
{
Label l1;
final Choice c;
ChoiceCls1()
{
Frame f=new Frame("Choice Example" );

l1=new Label();
l1.setAlignment(Label.RIGHT);

Button b1=new Button("Click here ");
b1.setBounds(100,100,100,50);
b1.addActionListener(this);
c=new Choice();
c.setBounds(150,150,100,50);
c.add("c++");
c.add("Python");
c.add("Core Java");
c.add("PHP");
c.add("C Prg");
f.add(c);

f.add(b1);
f.add(l1);

f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
l1.setText("Selected Item is  : "+c.getItem(c.getSelectedIndex()));
}
public static void main(String args[])
{
new ChoiceCls1();
}
}