class Average
{
int n= 0;
void Getdata(int a,int b,int c)
{
n=(a+b+c)/3;
}
void Showdata()
{

System.out.println("Average of no :" +n);
}
}
public class clsaverage 
{
public static void main(String args[])
{
Average n1=new Average();
n1.Getdata(10,25,50);
n1.Showdata();
}
}