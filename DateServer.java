import java.util.Date;
import java.net.*;
import java.io.*;
class DateServer
{
public static void main(String[] args)
{
ServerSocket ss=null;
try{
ss=new ServerSocket(1025);
System.out.println("Server is up and running");
}
catch(IOException ioe)
{
System.err.println("couldnot listen on port 1025");
System.exit(1);
}
Socket cs=null;
try{
cs=ss.accept();
System.out.println("Got client request");
}catch(IOException ioe)
{
System.out.println("Accept failed:7");
System.exit(1);
}
try
{
PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
BufferedReader in=new BufferedReader(new InputStreamReader
(cs.getInputStream()));
String input;
Date d=new Date();
input=in.readLine();
out.println(d);
out.close();
in.close();
cs.close();
ss.close();
}catch(IOException ioe){}
}
}