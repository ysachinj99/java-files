// constructor example1- Parameterizied const
class student
{
int r;
String nm;
public student(int rol,String s)
{
r=rol;
nm=s;
}
public void show()
{
System.out.println("Student Roll No is  : " +r);
System.out.println("Student Name is  : " +nm);
}
}
class Constructstudent
{
public static void main(String args[])
{
student s1=new student(30,"Sachin");

s1.show();
}}
