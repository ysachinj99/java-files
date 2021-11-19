import java.io.*;
import java.net.*;
public class stringrevClient{
public static void main(String[] args)throws IOException
{
Socket echoSocket=null;
PrintWriter out= null;
BufferedReader in=null;
try{
String hostName="localhost";
echoSocket=new Socket(hostName,1025);
out=new PrintWriter(echoSocket.getOutputStream(),true);
in=new BufferedReader(new InputStreamReader
(echoSocket.getInputStream()));
}
catch(UnknownHostException e){
System.err.println("unknown host");
System.exit(1);
}
catch(IOException e){}
out.println("Sachin");
System.out.println("Reverse is:"+in.readLine());
out.close();
in.close();
echoSocket.close();
}
}




