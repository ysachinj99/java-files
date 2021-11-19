//3)Print the average of three numbers entered by user
//by creating a class named 'Average' having a method to calculate and print the average.
//class clsaverage
{
int d;
void average(int a,int b,int c)
{
d=(a+b+c)/3;
System.out.println("Average of Three numbers is: "+d);
}
}
public class averagemain
{
public static void main(String args[])
{
clsaverage s1= new clsaverage();
s1.average(10,5,3);
}
}