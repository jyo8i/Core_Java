import java.util.*;
class Binary
{
	public static void main(String MJ[])
	{
		int i,n,quo,rev,d,c;
		Scanner mn=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		n=mn.nextInt();
		rev=0;
		c=1;

		for(i=n;i!=0;i=quo)
		{
			quo=i/2;
			d=(i%2);
			rev=(rev*10)+d;
			if(rev==0)
			{
				c=c*10;
			}
		}
		rev=rev*c;	
			System.out.print("Binary Number Is="+rev);
	}
}