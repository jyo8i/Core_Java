//JAVA PROGRAM TO THE CALCULATE THE POWER WHEN BASE AND EXPONENTIAL IS GIVEN
import java.util.*;      
class Power
{
	public static void main(String MJ[])
	{
		int i,b,e,pow;
		Scanner mn=new Scanner(System.in);
		
		System.out.print(":::Enter The Base=");
		b=mn.nextInt();
		System.out.print(":::Enter The Exponential=");
		e=mn.nextInt();
		
		pow=1;
		for(i=e;i!=0;i--)
		{
			pow=pow*b;
		}
		System.out.println(":::power Is="+pow);
	}
}