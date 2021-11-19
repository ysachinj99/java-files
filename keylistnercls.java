//itemListener
import java.awt.*;
import java.awt.event.*;

public class keylistnercls extends Frame implements KeyListener
{
textarea ta;
Label l;
keylistnercls()
{
l=new Label();
ta=new textArea();
l.setBounds(100,100, 50,50);
ta.setBounds(100,100, 50,50);
add(l);
add(ta);
ta.addkeyListener(this);

setSize(400,400);
setVisible(true);
setLayout(null);
}
public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new KeyListenerExample();  
    }  
}  