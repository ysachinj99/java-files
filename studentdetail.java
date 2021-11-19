import java.awt.*;
import java.awt.event.*;

public class studentdetail implements ActionListener
{
Button b;
TextField t1,t2,t3,display_details;
studentdetail()
{
Frame f=new Frame("Student detail");
//labels
Label l1=new Label("Name");
Label l2=new Label("Roll no");
Label l3=new Label("Age");
Label l4=new Label("Class");
Label l5=new Label("Gender");
Label l6=new Label("Hobbies");
Button b=new Button("Submit");
l1.setBounds(20,40,40,30);
l2.setBounds(20,80,50,40);
l3.setBounds(20,130,40,30);
l4.setBounds(20,180,60,30);
l5.setBounds(20,230,60,30);
l6.setBounds(20,260,60,30);
b.setBounds(20,320,60,30);
b.addActionListener(this);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(b);
TextField t1=new TextField();
t1.setBounds(60,40,180,30);
f.add(t1);
TextField t2=new TextField();
t2.setBounds(70,80,180,30);
f.add(t2);
TextField t3=new TextField();
t3.setBounds(60,120,180,30);
f.add(t3);


//choice for class
Choice c=new Choice();
c.setBounds(80,180,100,80);
c.add("fy");
c.add("sy");
c.add("ty");
f.add(c);

//chechboxgroup
CheckboxGroup cbg=new CheckboxGroup();
Checkbox c1=new Checkbox("Male",cbg,true);
Checkbox c2=new Checkbox("Female",cbg,false);
Checkbox c3=new Checkbox("Football");

c1.setBounds(80,220,50,50);
f.add(c1);
c2.setBounds(140,220,50,50);
f.add(c2);
c3.setBounds(80,250,50,50);
f.add(c3);

f.setSize(600,575);
f.setVisible(true);
f.setLayout(null);
}
 public static void main(String args[])
{
new studentdetail();
}

public void actionPerformed(ActionEvent e)
{
System.out.println("Deatils Submitted");

        if(e.getSource()==b)
{
        studentdetail= "Name: " + t1.getText();
       studentdetail= "Roll No:" + t2.getText();
      studentdetail= "Class : " +c.getSelectedItem();
     studentdetail= "Gander : " +c1.getSelectedCheckbox().getLabel();
    studentdetail= "Hobbies: "+c1.getSelectedCheckbox().getLabel();
  }
}
 }