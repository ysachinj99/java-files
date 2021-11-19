public class Addarry{
	public static void main(String args[]){
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	int i,j,k=0;
	System.out.println("Matrix A is:\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
	{
		a[i][j]= Integer.parseInt(args[k]);         
		k++;
		System.out.print(" "+a[i][j]);
	}
		System.out.println(" ");
	}
		k=4;
	System.out.println("Matrix B is:\n");
		for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
	{
		b[i][j]= Integer.parseInt(args[k]);
		k++;
		System.out.print(" "+b[i][j]);
	}
		System.out.println(" ");
	}
	System.out.println("Matrix C is:\n");
		for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
	{
		c[i][j]= a[i][j]+b[i][j];
		k++;
		System.out.print(" "+c[i][j]);
	}
		System.out.println(" ");
	}
	}
}