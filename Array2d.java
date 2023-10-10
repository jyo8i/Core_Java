import java.util.*;
class Array2d
{
	public static void main(String MN[])
	{
		int i,j;
		int ar[][]=new int[3][4];
		Scanner m=new Scanner(System.in);
	
	System.out.println("Enter Numbers to the 2D-Array");
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			ar[i][j]=m.nextInt();
		}
	}
	System.out.println("Entered Numbers Are:");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			System.out.print(" "+ar[i][j]);
		}
		System.out.println();
	}
	}
}