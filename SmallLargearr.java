public class SmallLargearr
{
public static void main(String args[])
{
int a[]= new int [5];
int i,j,s=1,l=1;
for(i=0;i<5;++i)
a[i]= Integer.parseInt(args[i]);
l=s=a[0];
for(i=1;i<5;++i)
{
if(a[i]>l)
l=a[i];
if(a[i]<s)
s=a[i];
}
System.out.println("Smallest of Array is:" +s);
System.out.println("Largest of Array is:" +l);
}
}