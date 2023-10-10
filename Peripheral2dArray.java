import java.util.*;
class Peripheral2dArray
{
	public static void main(String MN[])
	{
		int i,j;
		int ar[][]=new int[4][5];
		Scanner mj=new Scanner(System.in);
		System.out.println(":ENTER ELEMENTS TO THE ARRAY:");
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				ar[i][j]=mj.nextInt();
			}
		}
		System.out.println(":ARRAY ELEMENTS ARE:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		  System.out.println();
		}
		System.out.println(":2D ARRAY WITH PERIPHERAL ELEMENTS:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==0||j==0||i==3||j==4)
				{
					System.out.print(ar[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
	       	System.out.println();
		}
	}
}	