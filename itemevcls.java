//itemListener
import java.awt.*;
import java.awt.event.*;

public class itemevcls extends Frame implements ItemListener
{
Checkbox cb1,cb2;
Label l1;
itemevcls()
{
l1=new Label();
l1.setAlignment(l1.RIGHT);
l1.setSize(150,100);
cb1=new Checkbox("Java is : ");
cb2=new Checkbox("Python is  :  ");
cb1.setBounds(100,100, 50,50);
cb2.setBounds(100,100, 50,50);
add(l1);
add(cb1);
add(cb2);
cb1.addItemListener(this);
cb2.addItemListener(this);

setSize(400,400);
setVisible(true);
setLayout(null);
}
public void itemStateChanged(ItemEvent e)
{
System.out.println("eeeee");
if(e.getSource()==cb1)
{
l1.setText("Java is  : "+(e.getStateChange()==1 ?"Checked":"Unchecked"));
}

if(e.getSource()==cb2)
{
l1.setText("Python is :"+(e.getStateChange()==1 ?"Checked":"Unchecked"));
}


}

public static void main(String args[])
{
new itemevcls();
}
}