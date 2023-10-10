//INSERT NUMBERS TO AN ARRAY AND SHIFT EACH ELEMENT TO IT'S NEXT CELL,WHERE THE LAST ELEMENT WILL SHIFT TO FIRST CELL::::
import java.util.*;
class ArrayShift
{
	public static void main(String MN[])
	{
		int i,j,tmp;
		int ar[]=new int[10];
		
		Scanner mj=new Scanner(System.in);
		System.out.println(":ENTER NUMBERS TO ARRAY:");
		
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		System.out.println(":ORIGINAL ARRAY BELOW:");
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}System.out.println();
		
		tmp=ar[0];
		ar[0]=ar[9];
		for(i=8;i>=1;i--)
		{
			j=i+1;
			ar[j]=ar[i];
			if(i==1)
			{
				ar[i]=tmp;
			}
		}
		
		System.out.println(":SHIFTED ARRAY:");
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}