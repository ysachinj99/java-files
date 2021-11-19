import java.awt.*;    
import java.awt.event.*;   
public class studetails implements ActionListener{   
     Frame f;
     Label l1,l2,l3,l4,l5,l6,l7;
     Choice c;
     CheckboxGroup cgb = new CheckboxGroup();
     Checkbox c1,c2,c3,c4,c5,c6;
     Button b;
     TextField t1,t2,t3,t4;
	
     studetails() {  
     Frame f = new Frame();  
     
      Label l1 = new Label("Name:");   
      Label l2 = new Label("Roll no:");
      Label l3 = new Label("Age:");
      Label l4 = new Label("Location:");
      Label l5 = new Label("Class:");
      Label l6 = new Label("Gender:");
      Label l7 = new Label("Hobbies:");  
      
      Choice c = new Choice();
      
      CheckboxGroup cbg = new CheckboxGroup();
      Checkbox c1 = new Checkbox("Male",cbg,true);    
      Checkbox c2 = new Checkbox("Female",cbg,false);      
      Checkbox c3 = new Checkbox("Singing");    
      Checkbox c4 = new Checkbox("Dancing");      
      Checkbox c5 = new Checkbox("Reading");    
      Checkbox c6 = new Checkbox("Watching Movies");      
      
      Button b = new Button("Submit");
  
      TextField t1 = new TextField();  
      TextField t2 = new TextField();
      TextField t3 = new TextField(); 
      TextField t4 = new TextField(); 
       
      l1.setBounds(20, 40,40,30);
      l2.setBounds(20,80,50,40);
      l3.setBounds(20,130,40,30);
      l4.setBounds(20,180,60,30);
      l5.setBounds(20,230,60,30);
      l6.setBounds(20,260,60,30);
      l7.setBounds(20,290,60,30);
            
      t1.setBounds(80,40,180, 30); 
      t2.setBounds(80,80,180, 30); 
      t3.setBounds(80,120,180, 30);  
      t4.setBounds(80,180,180, 30);
      c.setBounds(80,232,75,75);
     c1.setBounds(80, 250,50,50); 
     c2.setBounds(140,250,50,50); 
     c3.setBounds(80,280,80,50); 
     c4.setBounds(170,280,95,50); 
     c5.setBounds(80,320,80,50); 
     c6.setBounds(170,320,800,50); 
       b.setBounds(80,380,105,50);
     
      f.add(l1);
      f.add(l2);
      f.add(l3);
      f.add(l4);
      f.add(l5);  
      f.add(l6);
      f.add(l7); 
      f.add(t1);  
      f.add(t2);
      f.add(t3); 
      f.add(t4); 
      f.add(c); 
      f.add(c1);
      f.add(c2);
      f.add(c3); 
      f.add(c4);
      f.add(c5);
      f.add(c6);
      f.add(b);
      c.add("F.Y Bsc");
      c.add("S.Y Bsc");
      c.add("T.Y Bsc");
        b.addActionListener(this); 
      f.setSize(400,500);  
     f.setTitle("Student Details");   
    f.setLayout(null);   
   f.setVisible(true);  
}
public static void main(String args[]) {   
studetails awt_obj= new studetails();    
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Details Submitted");
    if(e.getSource()==b)
   {
       }
}
}