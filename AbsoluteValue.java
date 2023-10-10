import java.util.*;
class AbsoluteValue
{
	public static void main(String MJ[])
	{
		int num,av;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:::");
		
		num=ob.nextInt();
		
		if(num<0)
		{
			av=num*(-1);
		}
		else
		{
			av=num;
		}
		System.out.println("ABSOLUTE VALE OF ENTERED NUMBER IS="+av);
	}
}