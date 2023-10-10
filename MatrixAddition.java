//JAVA PROGRAM TO ADD TWO MATRIX:::
import java.util.*;
class MatrixAddition
{
	public static void main(String MN[])
	{
		int i,j;
		int m1[][]=new int[3][4];  //1ST MATRIX INITIALIZATION
		int m2[][]=new int[3][4];  //2ND MATRIX INITIALIZATION
		int m3[][]=new int[3][4];  //RESULT MATRIX INITIALIZATION
		
		Scanner mj=new Scanner(System.in);
		System.out.println(":ENTER ELEMENTS TO THE 1ST MATRIX:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				m1[i][j]=mj.nextInt();
			}
		}
		System.out.println(":ENTER ELEMENTS TO THE 2ND MATRIX:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				m2[i][j]=mj.nextInt();
			}
		}
		//1ST MATRIX WILL DISPLAY
		System.out.println(":1ST MATRIX:::");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		//2ND MATRIX WILL DISPLAY
		System.out.println(":2ND MATRIX:::");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(m2[i][j]+" ");
			}
		System.out.println();
		}
		//FINAL,ADDITION OF 1ST AND 2ND MATRIX WILL DISPLAY
		System.out.println(":RESULT MATRIX:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
		System.out.println();
		}
	}
}