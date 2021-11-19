class Area 
{
int a,b1;
void setdim(int l,int b)
{
a= l; b1= b;
System.out.println("Length: "+l);
System.out.println("Breath: "+b);
}
void getArea()
{
System.out.println("Area of Rectangle: "+(a*b1));}
}

public class Areamainclass
{
public static void main(String args[])
{
Area s1= new Area();
s1.setdim(10,5);
s1.getArea();
}
}