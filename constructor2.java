// constructor example1- Parameterizied const
class student
{
int r;
String nm;
public student()
{
System.out.println("Student  Details Are As Follows : \n\n ");
r=34;
nm="Karan";
}
public student(int cl)
{
System.out.println("Student Class is : "+cl+ "nd Year !! ");
}
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
class constructor2
{
public static void main(String args[])
{
student s1=new student();
student s2=new student(2);
student s3=new student(76,"Sachin");
s1.show();
//s2.show();
s3.show();
}}