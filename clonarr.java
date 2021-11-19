public class clonarr
{
	public static void main(String[]args){
	int arr[]={33,3,4,5};
	System.out.println("Printing Original array");
 	for(int i:arr)
	System.out.println(i);
	System.out.println("Printing clone of  array");
                		int carr[]=arr.clone();
		for(int i:carr)
		System.out.println(i);
	System.out.println("Are both Equal ?");
	System.out.println(arr==carr);
	}
}