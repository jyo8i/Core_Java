import java.util.*;
class MatrixTranspose
{
	public static void main(String MN[])
	{
		int i,j,r,c;
		
		Scanner mj=new Scanner(System.in);
		
		System.out.println(":ENTER ROW-NUMBER:");
		r=mj.nextInt();
		System.out.println(":ENTER COLOUMN-NUMBER:");
		c=mj.nextInt();
		
		int md[][]=new int[r][c];
		int tm[][]=new int[c][r];
		System.out.println(":ENTER ELEMENTS TO THE MATRIX:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				md[i][j]=mj.nextInt();
			}
		}
		System.out.println(":ORIGINAL MATRIX:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(md[i][j]+" ");
			}
			System.out.println();
		}
		
	    for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				tm[j][i]=md[i][j];
			}
		}
		
		System.out.println(":TRANSPOSE MATRIX:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(tm[i][j]+" ");
			}
			System.out.println();
		}
	}
}