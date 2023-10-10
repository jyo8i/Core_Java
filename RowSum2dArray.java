import java.util.*;
class RowSum2dArray
{
	public static void main(String MN[])
	{
		int i,j,rsum;
		int ar[][]=new int[3][4];
		Scanner mj=new Scanner(System.in);		

		System.out.println("Enter Numbers To The Array:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				ar[i][j]=mj.nextInt();
			}
		}
		System.out.println("ARRAY-ELEMENTS ARE:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("................................................");
		//ROW-SUM:
		for(i=0;i<3;i++)
		{
			rsum=0;
			for(j=0;j<4;j++)
			{
				if(ar[i][j]%2==0)
				{
					rsum=rsum+ar[i][j];
				}
			}
		   System.out.println("Sum of Even element of Row"+(i+1)+"="+rsum);
		}
	}
}