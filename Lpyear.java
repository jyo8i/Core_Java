import java.util.*;
class Lpyear
{
	public static void main(String MJ[])
	{
		int i,ly;
		int iy=1900,fy=2022,count=0;
		
		System.out.println("Leap Year From 1900 to 2022");
		for(i=iy;i<=fy;i++)
		{
			if((i%4==0)||((i%400==0)&&(i%100!=0)))
			{
				ly=i;
				System.out.println(ly);
				count++;
			}
		}
	    System.out.println("Total Leap-Year="+count);
	}
	
}