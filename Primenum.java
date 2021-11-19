//PROGRAM TO FIND PRIME NUMBER. 
public class Primenum
{
 public static void main(String arg[])
 {
	int n=Integer.parseInt(arg[0]);
	int f=0;
	for(int i=2;i<=n/2;i++)
   	{
		if(n%i==0)
	{
		System.out.println("The number is not prime");
		f=1;
		break;
	}
	}
		if(f==0)
	{
		System.out.println("the number is prime");
	}
	}
}