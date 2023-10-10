import java.util.*;
class Ebill
{
	public static void main(String MJ[])
	{
		double tu,tb;           //tu=Total Unit Of Electricity Consumed , tb=Total-bill
		Scanner so=new Scanner(System.in);
		System.out.print("ENTER THE TOTAL UNIT OF ELCTRICTIY CONSUMED=");
		
		tu=so.nextDouble();
		
		if(tu<=150)
		{
			tb=220;
		}
		else if(tu<=300)
		{
			tb=220+(tu-150)*2.8;
		}
		else if(tu<=450)
		{
			tb=220+(300-150)*2.8+((tu-450)*3.8);
		}
		else
		{
			tb=220+(300-151)*2.8+((450-301)*3.8)+((tu-451)*5);
		}
		System.out.println("TOTAL BILL="+tb);
	}
}