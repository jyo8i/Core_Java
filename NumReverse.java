import java.util.*;
class NumReverse
{
	public static void main(String MJ[])
	{
		int i,n,d,rev;
		Scanner co=new Scanner(System.in);
		
		System.out.print("Enter Any Number To Reverse=");
		n=co.nextInt();
		
		rev=0;
		for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			rev=(rev*10)+d;
		}
		System.out.println("Reversed Number Is="+rev);
	}
}