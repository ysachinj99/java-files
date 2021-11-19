import java.util.*;
public class arrayQ5
{
public static void main(String args [])
{
int arr[]=new int[5];
int i,f,nf,num;
for(i=0;i<5;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
Scanner in= new Scanner(System.in);
System.out.println("Enter the no to Search:");
int n= in.nextInt();
for(i=0;i<5;i++)
{
	if (arr[i]== n)
	{
	System.out.println(n+" has Found at index :"+i);	
	}
	else{
	System.out.println(n+"Not Found ");
	}
}

}
}