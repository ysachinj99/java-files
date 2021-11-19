public class Append1
{
public static void main(String args[])
{
StringBuffer sb= new StringBuffer("praveen");
System.out.println("string is : "+sb);
sb.append("Kumar");
System.out.println("After append: "+sb);
  String str= new String("SDJ");
System.out.println("Given string is : "+str);
str.concat("java");
System.out.println("After concat: "+str);
}
}