//MENUBAR
import java.awt.*;
class Menuex{
Menuex()
{
Frame f= new Frame("Menu Bar Example");
MenuBar mb= new MenuBar();
Menu m= new Menu("Menu");
Menu sbm= new Menu("Sub Menu");
MenuItem i1= new MenuItem("Item 1");
MenuItem i2= new MenuItem("Item 2");
MenuItem i3= new MenuItem("Item 3");
MenuItem i4= new MenuItem("Item 4");
MenuItem i5= new MenuItem("Item 5");
m.add(i1);
m.add(i2);
m.add(i3);
sbm.add(i4);
sbm.add(i5);
m.add(sbm);
mb.add(m);
f.setMenuBar(mb);
f.setSize(400, 400);
f.setVisible(true);
f.setLayout(null);
}
public static void main(String args[])
{
new Menuex();
}
}