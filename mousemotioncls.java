//mouse motion
import java.awt.*;
import java.awt.event.*;
public class mousemotioncls extends Frame implements MouseMotionListener
{
Label l1;
mousemotioncls()
{
addMouseMotionListener(this);
setSize(400,400);
setVisible(true);
setLayout(null);
}
public void mouseDragged(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),30,30);
}
public void mouseMoved(MouseEvent e)
{
}
public static void main(String args[])
{
new mousemotioncls();
}
}