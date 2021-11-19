import java.util.StringTokenizer;
public class  StringTokenizerex{
public static void main(String args [])
{
String s= "abc;pqr;xyz;123;456";
System.out.println("Entered String: "+s);
StringTokenizer st= new StringTokenizer(s,";");
System.out.println("AfterTokenizing");
while(st.hasMoreElements())
{
System.out.println(st.nextElement());
}
} 
}