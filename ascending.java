// Write a java prg  take 5 no from user and  sort  then in  Ascending order
public class ascending
{
public static void main(String args [])
{
int arr[]=new int[5];
int i,j,t=0;
for(i=0;i<5;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
System.out.println("Element After Sorting in Ascending");
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{ 
if (arr[i]>arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;	
}
}
System.out.println(arr[i]);
}
}
} 
