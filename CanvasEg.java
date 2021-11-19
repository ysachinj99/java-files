import java.awt.*;
public class CanvasEg 
{
CanvasEg()
{
Frame f=new Frame("Canvas Example");
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
f.add(new Mycanvas());
}
public static void main(String args[])
{
new CanvasEg();
}
}
class Mycanvas extends Canvas
{
public Mycanvas()
{
setBackground(Color .YELLOW);
setSize(600,600);
}
public void paint(Graphics g)
{
g.setColor(Color.ORANGE);
g.fillRect(75,75,150,30);
g.setColor(Color.WHITE);
g.fillRect(75,105,150,30);
g.setColor(Color.GREEN);
g.fillRect(75,135,150,30);
g.setColor(Color.BLACK);
g.fillRect(55,255,50,20);
g.setColor(Color.GRAY);
g.fillRect(42,275,75,20);
g.setColor(Color.RED);
g.fillRect(28,295,100,20);
g.setColor(Color.BLUE);
g.fillOval(135,105,30,30);
g.setColor(Color.BLACK);
g.fillRect(75,75,10,200);
g.setColor(Color.BLACK);
g.fillOval(75,69,9,10);
g.setColor(Color.BLACK);
g.fillOval(76,65,6,5);
}
}