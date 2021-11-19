public class smallar
{
static void min(int a[])
{
int min=0;
min=a[0];  //=7

for(int i=0;i<a.length;i++)
{
if(a[i]<min) //2< 7  0<7 
{
min=a[i];
}
}
System.out.println("smallest no."+min);

}
public static void main(String args[])
{
int a[]={7,2,0,66,34};
min(a);
}
}