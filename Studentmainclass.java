class Student
{
String nm;
int rollno;
void Getdata(String s,int r)
{
nm=s;
rollno=r;
}
void Showdata()
{
System.out.println("Student name is:" +nm);
System.out.println("Student roll no is:" +rollno);
}
}
public class studentmain
{
public static void main(String args[])
{
Student a1=new Student();
a1.Getdata("JOHN",2);
a1.Showdata();
}
}