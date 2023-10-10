import java.util.*;
class ArrayBig1st2nd
{
	public static void main(String MN[])
	{
		int i,flr,slr;    //flr=First-Largest   ,slr=Second-Largest
	    int ar[]=new int[10];
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter 10 Numbers For Array:");
		
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		
		flr=ar[0];
		
		for(i=1;i<10;i++)
		{
			if(ar[i]>=flr)
			{
				flr=ar[i];
			}
		}
		slr=ar[0];
		for(i=1;i<10;i++)
		{
			if(ar[i]>slr && ar[i]<flr)
			{
				slr=ar[i];
			}
		}
		
		System.out.println("First-Largest Number is="+flr);
		System.out.println("Second-Largest Number is="+slr);
	}
}
		