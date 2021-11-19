// Creating  Object Using another class

class bigclass
{
void show()
{
System.out.println("This is show method from Bigclass");
}
int squ(int a)
{
return (a*a);
}
}
public class smallmainclass
{
public static void main(String args[])
{
bigclass b1=new bigclass();
b1.show();
int n=10;
System.out.println("Square is:"+b1.squ(n));
}
}