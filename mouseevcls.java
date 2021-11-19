//mouse Listener
import java.awt.*;
import java.awt.event.*;

public class mouseevcls extends Frame implements MouseListener
{
Label l1;
mouseevcls()
{
l1=new Label("");
l1.setBounds(90, 200, 100, 3);
add(l1);
l1.addMouseListener(this);
setSize(300,300);
setVisible(true);
setLayout(null);
}
public void mouseClicked(MouseEvent e)
{
l1.setText("Mouse is Clicked!! ");
}
public void mouseEntered(MouseEvent e)
{
l1.setText("Mouse is Entered!! ");
}
public void mouseExited(MouseEvent e)
{
l1.setText("Mouse is Exited ");
}
public void mousePressed(MouseEvent e)
{
l1.setText("Mouse is Pressed!! ");
}
public void mouseReleased(MouseEvent e)
{
l1.setText("Mouse is Released!! ");
}
public static void main(String args[])
{
new mouseevcls();
}
}