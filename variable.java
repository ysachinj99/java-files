public class Variable
{
static int m=100;//static variable
void method()
{int n=90;
 System.out.println("Local Variable:n" +n);
}
public static void main(String arg[])
{int data=50;
 
 System.out.println("Static Variable:m" +m);
 System.out.println("Instant Variable:data" +data);
}
}