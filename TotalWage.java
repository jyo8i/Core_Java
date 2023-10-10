import java.util.*;           
class TotalWage
{
	public static void main(String MJ[])
	{
		int th,wg;             //th=Total hours worked  ,  wg=Total Wages
		
		Scanner xo=new Scanner(System.in);
		System.out.print("ENTER THE HOURS WORKED=");
		
		th=xo.nextInt();
		
		if(th<=8)
		{
			wg=500;
		}
		else if(th<=10)
		{
			wg=500+(th-8)*50;
		}
		else if(th<=12)
		{
			wg=500+(10-8)*50+((th-10)*80);
		}
		else
		{
			wg=500+(10-8)*50+((12-10)*80)+((th-12)*100);
		}
		System.out.println("TOTAL WAGES="+wg);
	}
}
