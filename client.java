import java.net.*;
import java.io.*;
public class client
{
public static void main(String args[])
{
Socket s= new Socket("localhost",7);
PrintWriter pr= new PrintWriter(s.getOutputStream());
pr.println("is it working");
pr.flush();
InputStreamReader in = new InputStreamReader(s.getInputStream());
BufferedReader bf = new BufferedReader(in);
String str = bf.readline();
System.out.println("server:"+str);
}
}