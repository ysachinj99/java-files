interface MyInterface1 {
    void m();
}

interface MyInterface2 {
    void n();
}


/*
 * Class implements two interfaces and provides implementation to the
 * methods of both interface.
 */
public class MyClass implements MyInterface1, MyInterface2
{
    public static void main(String[] args)
 {
           MyClass obj=new MyClass();
           obj.m();
           obj.n();          
    }

       @Override
    public void m(){
           System.out.println("in implementation of MyInterface1's m()");
    }

    @Override
    public void n(){
           System.out.println("in implementation of MyInterface2's n()");
    }
}

