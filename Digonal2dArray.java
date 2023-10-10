import java.util.*;
class Digonal2dArray
{
	public static void main(String MN[])
	{
		int i,j;
		int ar[][]=new int[4][4];
		Scanner mj=new Scanner(System.in);
		
		System.out.println(":ENTER THE ARRAY ELEMENTS:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				ar[i][j]=mj.nextInt();
			}
		}
		System.out.println(":ARRAY ELEMENTS ARE:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		System.out.println(" ");
		}
		System.out.println(":DIGONAL ELEMENTS IN DIGONAL SHAPE:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(i==j||(i+j==3))
				{
					System.out.print(ar[i][j]+"  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
		System.out.println();
		}
	}
}