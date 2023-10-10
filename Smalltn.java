//JAVA PROGRAM TO FIND SMALLEST AMONG THREE NUMBERS USING IF STATEMENT
import java.util.*;
class Smalltn
{
	public static void main(String MJ[])
	{
		Scanner ob=new Scanner(System.in);
		int x,y,z,sml;
		System.out.println("Enter any Three Numbers:::");
		x=ob.nextInt();
		y=ob.nextInt();
		z=ob.nextInt();
		
		sml=x;
		
		if(y<sml)
		{
			sml=y;
		}
		if(z<sml)
		{
			sml=z;
		}
		
		System.out.println("Smallest Number is="+ sml);
	}
}