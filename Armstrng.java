import java.util.*;            //JAVA PROGRAM TO CHECK ARMSTRONG NUMBER
class Armstrng
{
	public static void main(String MN[])
	{
		int i,n,d,sum;
		Scanner mj=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		n=mj.nextInt();
		
		sum=0;
		for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			sum=sum+(d*d*d);
		}
		if(sum==n)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}