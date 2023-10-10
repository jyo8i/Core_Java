import java.util.*;         //JAVA PROGRAM TO CHECK PERFECT NUMBER
class PerfctNum      //IF THE SUM OF PROPER DIVISOR OF NUMBER IS SAME AS THE NUMBER ,THEN THE NUMBER IS PERFECT
{
	public static void main(String mn[])
	{
		int i,n,sum;
		Scanner mj=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		n=mj.nextInt();
		
		sum=0;
		System.out.println("Proper Divisor Are:::");
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			System.out.println(i);
			}
		}System.out.println();
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not A Perfect Number");
		}
	}
}