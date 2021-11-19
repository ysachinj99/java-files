//KEY Listener
import java.awt.*;  
import java.awt.event.*;  
public class Keycls extends Frame implements KeyListener{  
    Label l1;  
    TextArea ta;  
    Keycls(){  
          
        l1=new Label();  
        l1.setBounds(20,20,70,50);  
        add(l1);
        ta=new TextArea();  
        ta.setBounds(100,120,70,70);  
        add(ta);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        ta.addKeyListener(this);
    }  
    public void keyPressed(KeyEvent e) {  
        l1.setText("Key is Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        l1.setText("Key is Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l1.setText("Key is Typed");  
    }  
  
    public static void main(String[] args) {  
        new Keycls();  
    }  
}