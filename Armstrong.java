//PROGRAM TO FIND ARMSTRONG NUMBER.
public class Armstrong
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int i=n,r,sum=0;

while(i>0)
{
r=i%10;
sum+=r*r*r;
i=i/10;
}
if(n==sum)
System.out.println("The number is Armstrong");
else
System.out.println("The number is not Armstrong");
}
}