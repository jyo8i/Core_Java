import java.util.*;
class BigsmallTen
{
	public static void main(String MN[])
	{
		int i,n,big,sml;
		Scanner mj=new Scanner(System.in);
		
		System.out.println("Enter Any 10 Number:");
		n=mj.nextInt();
		big=n;
		sml=n;
		
		for(i=1;i<10;i++)
		{
			
			n=mj.nextInt();
			if(n>big)
			{
				big=n;
			}
			if(n<sml)
			{
				sml=n;
			}
	
		}
		System.out.println("Smallest Number="+sml);
		System.out.println("Biggest Number="+big);	
	}
}