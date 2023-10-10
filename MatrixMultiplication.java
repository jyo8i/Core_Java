//JAVA PROGRAM OF MATRIX:MULTIPLICATION OF TWO DIFFERENT MATRIX AND DISPLAYING THE RESULTED MATRIX:
import java.util.*; 
class MatrixMultiplication
{
	public static void main(String MN[])
  {
	int i,j,k;
	
	Scanner mj=new Scanner(System.in);
	System.out.println(":ENTER ROW1-NUMBER:");
	int r1=mj.nextInt();
	System.out.println(":ENTER COLOUMN1-NUMBER:");
	int c1=mj.nextInt();
	System.out.println(":ENTER ROW2-NUMBER:");
	int r2=mj.nextInt();
	System.out.println(":ENTER COLOUMN2-NUMBER:");
	int c2=mj.nextInt();
	
	if(c1!=r2)
	{
		System.out.println(":MATRIX-MULTIPLICATION IS NOT! POSSIBLE:");
		return;
	}
	//:MATRIX INITAILIZTION:::
	int a[][]=new int[r1][c1];
	int b[][]=new int[r2][c2];
	int m[][]=new int[r1][c2];
	
	System.out.println(":ENTER NUMBERS FOR MATRIX-1:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			a[i][j]=mj.nextInt();
		}
	}
	System.out.println(":ENTER NUMBERS TO MATRIX-2:");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
			b[i][j]=mj.nextInt();
		}
	}
	
	System.out.println(":MATRIX-1:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
		   System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(":MATRIX-2:");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	//MATRIX-MULTIPLICATION:::OF 1ST AND 2ND MATRIX:::
	System.out.println("MUTIPLIED-MATRIX:");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			m[i][j]=0;
			for(k=0;k<c1;k++)
			{
				m[i][j]=m[i][j]+(a[i][k]*b[k][j]);
			}
			System.out.print(m[i][j]+" ");
		}
		System.out.println();
	}
  }
}