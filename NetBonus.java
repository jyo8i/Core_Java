import java.util.*;                //SALARY-HIKE OF 5% IF YEARS OF SERVICE IS MORE THAN 5
class NetBonus
{
	public static void main(String MJ[])
	{
		int sl,yr;                 //sl=salary , yr=year
		double b,nb;              //b=bonus , nb=net-bonus
		
		Scanner ob=new Scanner(System.in);
		System.out.print("ENTER THE SALARY OF EMPLOYEE=");
		sl=ob.nextInt();
		
		System.out.print("ENTER THE YEARs OF SERVICE GIVEN=");
		yr=ob.nextInt();
		
		if(yr>5)
		{
	      System.out.println("BONUS ADDED OF 5%:::");
        	b=sl*0.05;
			nb=sl+b;
		}
		else
		{
			System.out.println("!NO BONUS");
			nb=sl;
		}
		System.out.println("NET-BONUS/TOTAL-SALARY="+nb);
	}
}