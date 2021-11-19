public class array1
{
	public static void main(String args[])
	{
		int arr[] = new int[10];
		int i,p=0,n=0,z=0,e=0,o=0,j,k;
	for(i=0;i<10;i++)
	{
		 arr[i]=Integer.parseInt(args[i]);
	}
	for(i=0;i<10;i++)
	{
		if(arr[i]<0)
                   		{
                      		n++;   
                   		}
                 	                 else if(arr[i]==0)
                   		{
                      		z++;   
                    	}
                                   else
                  		 {
                    		  p++;   
                   		 }  	   
	}
for (i=0; i <10; i++)
{
	if(arr[i]%2 == 1)
	{
	    o++;
	}
	else
	     e++;
}
    
System.out.println(p+":Positive no");
System.out.println(n+":Negative no");
System.out.println(z+":Zero no");
System.out.println(e+":Even no");
System.out.println(o+":Odd no");
 	}	
}