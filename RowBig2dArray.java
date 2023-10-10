import java.util.*;
class RowBig2dArray
{
	public static void main(String MN[])
	{
		int i,j,rbig;
		int ar[][]=new int[3][4];
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Elements to The Array:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				ar[i][j]=mj.nextInt();
			}
		}
		System.out.println(":ARRAY ELEMENTS ARE:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		System.out.println(" ");
		}
		System.out.println("..........................................");
		
		for(i=0;i<3;i++)
		{
			rbig=ar[i][0];
			for(j=1;j<4;j++)
			{
				if(ar[i][j]>=rbig)
				{
					rbig=ar[i][j];
				}
			}
			System.out.println("Biggest num of Row:"+(i+1)+":is="+rbig);
		}
	}
}		