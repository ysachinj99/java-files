/*Write a java program for constructor overloading using 

employee class which print the details of 3 employees*/

class employee
{
int emp_id;
String name,ql;
Double sal;


public employee()
{
emp_id=101;
name="Neena";
ql="BSC CS";
sal=20000.00;

}
public employee(int id)
{

System.out.print(id+ "  is not working anymore");

}
public employee(int id,String nm,String q,Double s)
{
emp_id=id;
name=nm;
ql=q;
sal=s;
}
public void show()
{
System.out.print("Employee id : "+emp_id);
System.out.print("Name is : "+name);
System.out.print("Qualifications are : "+ql);
System.out.print("Salary is: "+sal);
}
}
class constructor3
{
public static void main(String args[])
{
employee e1=new employee();
employee e2=new employee(102);
employee e3=new employee(103,"Deepak","MSC Cs",20000.00);
employee e4=new employee(104,"Arun","MSC Cs",20000.00);

e1.show();
e2.show();
e3.show();
e4.show();

}
}