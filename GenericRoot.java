import java.util.*;
class GenericRoot
{
	public static void main(String MJ[])
	{
		int grt,n;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER NUMBER TO FIND GENERIC ROOT:::");
		n=ob.nextInt();
		
		if(n%9==0)
		{
			grt=9;
		}
		else
		{
			grt=n%9;
		}
		System.out.println("GENERIC ROOT="+grt);
    }
}