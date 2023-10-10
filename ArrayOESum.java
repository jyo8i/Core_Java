import java.util.*;
class ArrayOESum
{
	public static void main(String MN[])
	{
		int i,osum,esum;         //osum=Sum Of Odd Numbers ,esum=Sum Of Even Numbers
		int ar[]=new int[10];
		Scanner mj=new Scanner(System.in);
		
		System.out.println("Input Any 10 Numbers to The Array:");
		esum=osum=0;
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
			if(ar[i]%2==0)
			{
				esum=esum+ar[i];
			}
			else
			{
				osum=osum+ar[i];
			}
		}
		System.out.println("Sum of Even-Num="+esum);
		System.out.println("Sum of Odd-Num="+osum);
	}
}