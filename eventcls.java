// Action Listener
import java.awt.*;
import java.awt.event.*;
public class eventcls extends Frame implements ActionListener
{
TextField t;
eventcls()
{
t=new TextField();
t.setBounds(40,30,70,50);

Button b=new Button("Click");
b.setBounds(110,160,50,50);

add(t);
add(b);
b.addActionListener(this);
setSize(300,300);
setVisible(true);
setLayout(null);
}

public void actionPerformed(ActionEvent e)
{
String s=t.getText();
System.out.println("Msg is  :" +s);
}
public static void main(String args[])