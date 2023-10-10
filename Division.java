import java.util.*;
class Division
{
	public static void main(String MJ[])
	{
		Scanner ob=new Scanner(System.in);
		int m1,m2,m3,m4;
		double avg;
		
		System.out.println("ENTER THE MARKS OF 4 DIFFERENTs SUBJECT:");
		
		m1=ob.nextInt();
		m2=ob.nextInt();
		m3=ob.nextInt();
		m4=ob.nextInt();
		
		avg=(m1+m2+m3+m4)/4;
		
		if(avg<=29)
		{
			System.out.println("--FAIL--");
		}
		else if(avg<=49)
		{
			System.out.println("--THIRD--");
		}
		else if(avg<=59)
		{
			System.out.println("--SECOND--");
		}
		else
		{
			System.out.println("--FIRST--");
		}
	}
}