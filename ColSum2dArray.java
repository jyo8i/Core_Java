import java.util.*;
class ColSum2dArray
{
	public static void main(String MN[])
	{
		int i,j,csum;
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
		 System.out.println("ARRAY ELEMENTS ARE:");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<4;j++)
			 {
				 System.out.print(ar[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
		 System.out.println("................................................");
		 
		 for(j=0;j<4;j++)
		 {
			 csum=0;
			 for(i=0;i<3;i++)
			 {
				 if(ar[i][j]%2!=0)
				 {
					 csum=csum+ar[i][j];
				 }
			 }
			 System.out.println("Sum of Element of coloumn:"+(j+1)+"="+csum);
		 }
	}
}