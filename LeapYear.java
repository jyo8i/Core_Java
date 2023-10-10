import java.util.*;
class LeapYear
{
	public static void main(String MJ[])
	{
		int yr;
		Scanner mj=new Scanner(System.in);
		System.out.println("ENTER YEAR TO CHECK LEAP-YEAR");
		yr=mj.nextInt();
		
		if((yr%400==0)||(yr%4==0 && yr%100!=0))
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("NOT A LEAP YEAR");
		}
		
	}
}