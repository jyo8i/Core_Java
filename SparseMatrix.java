//JAVA PROGRAM TO CHECK WHETHER A MATRIXIS SPARSE OR NOT:::
import java.util.*;
class SparseMatrix
{
	public static void main(String MN[])
	{
		int i,j,cnt=0;    //cnt is count for counting purpose
		int ar[][]=new int[4][5];
		Scanner mj=new Scanner(System.in);
		System.out.println(":ENTER ELEMENTS TO THE MATRIX:");
		
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
				if(ar[i][j]==0)
				{
					cnt++;
				}
				System.out.print(ar[i][j]+" ");
			}
		System.out.println();
		}
		int r=4,c=5;      //HERE r=numbers of Row and c=numbers of Coloumn
		if(cnt>((r*c)/2))
		{
			System.out.println(":ABOVE MATRIX IS SPARSE MATRIX:");
		}
		else
		{
			System.out.println(":ABOVE MATRIX IS NOT A SPARSE MATRIX:");
		}
	}
}				