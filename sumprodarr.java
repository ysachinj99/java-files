public class sumprodarr
{
public static void main(String args[])
{
int a[]= new int [5];
int i,j,s=0,p=1;
for(i=0;i<5;i++)
{
a[i]= Integer.parseInt(args[i]);
s= s+a[i];
p= p*a[i];
}
System.out.println("Sum of Array is:" +s);
System.out.println("Product of Array is:" +p);
}
}