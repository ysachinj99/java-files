public class largest 
{
   public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);//a=10
b=Integer.parseInt(args[1]);//b=5
c=Integer.parseInt(args[2]);//c=12
if (a>b)
{
       if (a>c)
       {
       System.out.println(a+":is the largest no");  
       }
       else
       {															
       System.out.println(c+":is the largest no");  
       }
}
else 
{
       if (b>c)
       {
       System.out.println(b+":is the largest no");  
       }
       else
       {
       System.out.println(c+":is the largest no");  
       }
}
}
}
