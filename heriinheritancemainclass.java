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
class dog extends animal  //child class
{
void display1()
{
System.out.println("Name of Animal is : "+nm);
System.out.println("No. of legs of Animal is : "+legs);
System.out.println("Life of Animal is : "+life);
}
}

class heriinheritancemainclass
{
public static void main(String args[])
{
cat c1=new cat();
c1.data();
c1.display();

dog d1=new dog();
d1.data();
d1.display1();
}
}

/*
animal---Super class   Single level
  |
  Cat/Dog----Subclass 
*/