import java.util.*;
class JaggedArray
{
	public static void main(String MN[])
	{
		int ja[][]=new int[4][];
		ja[0]=new int[2];
		ja[1]=new int[5];
		ja[2]=new int[1];
		ja[3]=new int[3];
		
		int i,j;
		Scanner mj=new Scanner(System.in);
		System.out.println(":ENTER THE NUMBERS:");
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<ja[i].length;j++)
			{
				ja[i][j]=mj.nextInt();
			}
		}
		System.out.println(":JAGGED ARRAY BELOW:");
		 for(i=0;i<4;i++)
		 {
			 for(j=0;j<ja[i].length;j++)
			 {
				 System.out.print(ja[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}