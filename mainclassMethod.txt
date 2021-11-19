// methods
class methodsclass
{
void show1()
{
System.out.println("This is Show 1 !! ");
}
void show2()
{
System.out.println("This is Show 2 !! ");
show3();
}
static void show3()
{
System.out.println("This is ********STATIC Show 3****** !! ");
}
}
public class mainclassMethod
{
public static void main(String args[])
{
methodsclass m1=new methodsclass();
m1.show1();
m1.show2();

}
}