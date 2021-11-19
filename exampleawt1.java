// By Assoication
import java.awt.*;
public class exampleawt1
{
public static void main(String args[])
{
	Frame f=new Frame("First AWT Prg");
	Label l1=new Label("Welcome to AWT Prg");
	Button b1=new Button(" AWT Toolkit");
	f.add(l1);
	f.add(b1);
l1.setBounds(10,40,100,100);
b1.setBounds(100,190,100,100);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
}