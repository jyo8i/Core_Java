//Sum and Average of Three numbers
import java.util.*;
class Sumavg
{
	public static void main(String MJ[])
	{
		Scanner ob=new Scanner(System.in);
		int x,y,z,sum;
		double avg;
		
		System.out.println("ENTER ANY THREE NUMBERS:::");
		x=ob.nextInt();
		y=ob.nextInt();
		z=ob.nextInt();
		
		sum=x+y+z;
		avg=sum/3;
		
		System.out.println("SUM IS="+sum);
		System.out.println("AVERAGE IS="+avg);
	}
}
