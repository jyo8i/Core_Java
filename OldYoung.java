import java.util.*;
class OldYoung
{
	public static void main(String MJ[])
	{
		int a,b,c,yng,old;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER THE AGES OF THREE PEOPLE:::");
		
		a=ob.nextInt();
		b=ob.nextInt();
		c=ob.nextInt();
		
		if(a<=b&&a<=c)
		{
			yng=a;
		}
		else if(b<=a&&b<=c)
		{
			yng=b;
		}
		else
		{
			yng=c;
		}
		if(a>=b&&a>=c)
		{
			old=a;
		}
		else if(b>=a&&b>=c)
		{
			old=b;
		}
		else
		{ 
	      old=c;
		}
	System.out.println("YOUNGEST AMONG THREE IS::"+yng);
	System.out.println("OLDEST AMONG THREE PEOPLE IS::"+old);
	}
}
