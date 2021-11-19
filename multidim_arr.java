public class multidim_arr
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int i,j,k=0;
		for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
					{
						a[i][j]= Integer.parseInt(args[k]);
						System.out.print(" "+a[i][j]);
						k++;
					}
				System.out.println(" ");
			}
	}
}