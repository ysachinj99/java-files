class Employee
{
String nm, add;
int y1;
void Getdata(String s,int y, String a)
{
nm=s;
y1=y;
add=a;
}
void Showdata()
{
System.out.println(nm+" \t\t " +y1+ " \t " +add);
}
}
public class Empmaincls
{
public static void main(String args[])
{
Employee e1=new Employee();
System.out.println("Name    year of Joining   Address");
e1.Getdata("Robert", 1994, "64-C Wallstreet");
e1.Showdata();
e1.Getdata("Sam",2000,  "68-D Wallstreet");
e1.Showdata();
e1.Getdata("John",1999, "26-B Wallstreet");
e1.Showdata();
}
}