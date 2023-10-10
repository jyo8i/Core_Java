import java.util.*;
class MultiDimensionalArray
{
	public static void main(String MN[])
	{
		int md[][][]=new int[3][4][5];
		int i,j,k;
		Scanner mj=new Scanner(System.in);
		
		System.out.println(":ENTER THE NUMBERS:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				for(k=0;k<5;k++)
				{
					md[i][j][k]=mj.nextInt();
				}
			}
		}
		
		System.out.println(":MULTI-DIMENSIONAL ARRAY BELOW:");
		for(i=0;i<3;i++)
		{
			System.out.println();
			for(j=0;j<4;j++)
			{
				for(k=0;k<5;k++)
				{
					System.out.print(md[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}