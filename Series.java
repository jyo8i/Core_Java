import java.util.*;
class Series
{
	public static void main(String MN[])
	{
		int i,j,num,fact;
		double sum=0;
		Scanner mj=new Scanner(System.in);
		
		System.out.println("Enter Step Number:");
		num=mj.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=1;
			for(j=i+1;j>=i;j--)
			{
				fact=fact*j;
			}
		sum=sum+(double)i/fact;
		}
		System.out.println("Series Sum="+sum);
	}
}		