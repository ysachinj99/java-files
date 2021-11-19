//Single level
import java.util.*;
class animal   // parent class
{
int legs;
String nm;
int life;
void data()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No of Legs : ");
legs=sc.nextInt();
System.out.println("Enter the Name of animal: ");
nm=sc.next();
System.out.println("Enter the life of animal : ");
life=sc.nextInt();
}
}

class cat extends animal  //child class
{
void display()
{
System.out.println("Name of Animal is : "+nm);
System.out.println("No. of legs of Animal is : "+legs);
System.out.println("Life of Animal is : "+life);
}
}
class Act extends cat
{
void Sounds()
{
System.out.println("Does MEOW MEOW!!!");
}
}

class MultiInheritancemainclass
{
public static void main(String args[])
{
Act c1=new Act();
c1.data();
c1.display();
c1.Sounds();
}
}

/*
animal---Super class   Multi level
  |
  Cat ----Parent--Act
     |
    Act----Subclass 
*/