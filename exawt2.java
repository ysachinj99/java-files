// Inherti
import java.awt.*;
public class exawt2 extends Frame 
{
exawt2()
{
	Label l1=new Label("Welcome to AWT!!");
	Button b1=new Button(" AWT Toolkit");
	l1.setBounds(10,10,100,100);
	b1.setBounds(150,50,150,60);
add(b1);
add(l1);
setSize(300,50);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
exawt2 e1=new exawt2();
}
}