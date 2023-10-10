import java.util.*;
class ArrayBigSmall
{
	public static void main(String MN[])
	{
		int i,big,sml;
		int ar[]=new int[10];
		Scanner mj=new Scanner(System.in);
		
		System.out.println("Input any 10 Into the Array:");
		
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		big=sml=ar[0];
		for(i=1;i<10;i++)
		{
			if(ar[i]>=big)
			{
				big=ar[i];
			}
		    if(ar[i]<=sml)
			{
				sml=ar[i];
			}
		}
	System.out.println("Biggest Num is="+big);
	System.out.println("Smallest Num is="+sml);
	}
}			