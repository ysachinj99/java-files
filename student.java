public class student{  
    public static void main(String args[])
{   
     int m1,m2,m3,rollno;
     String name;
     name=args[0];
     rollno=Integer.parseInt(args[1]);
     {
       System.out.println("Name of Student:"+name);
       System.out.println("Rollno of student: "+rollno);
     }
     double p;
     m1=Integer.parseInt(args[2]);
     m2=Integer.parseInt(args[3]);
     m3=Integer.parseInt(args[4]);
     p =(m1+m2+m3)/3;
          if(p>75)
      {
       System.out.println("Your Grade is: A with percent"+p);
     }  
     else if(p>60 && p<=75)
      {
       System.out.println("Your Grade is: B with percent"+p);
     } 
     else if(p>50 && p<=60)
      {
       System.out.println("Your Grade is: C with percent"+p);
     }
     else if(p>35 && p<=50)
      {
       System.out.println("Your Grade is: D with percent"+p);
     } 
     else if(p<35)
      {
       System.out.println("Your Fail");
     }
  }
}
 
