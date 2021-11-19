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


class aminalmainclass
{
public static void main(String args[])
{
cat c1=new cat();
c1.data();
c1.display();
}
}

/*
animal---Super class   Single level
  |
  Cat ----Subclass 
*/