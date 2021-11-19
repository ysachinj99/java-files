//wap java program for addition of numbers using different methods and with a class.
class clsadd 
{
int c;

void add(int a,int b)
{
c=a+b;
System.out.println("addition of two numbers is: "+c);}

void add(String s1,String s2){
System.out.println("addition of two string is: "+(s1+s2));}
}

public class addmainclass
{
public static void main(String args[])
{
clsadd s1= new clsadd();
s1.add(12,5);
s1.add("Sneha", " Yadav ");
}
}