import java.util.*;
class Grade
{
	public static void main(String MJ[])
	{
		int mrk;
		char grd=0;
		
		Scanner ob=new Scanner(System.in);
		System.out.print("ENTER THE MARK=");
		mrk=ob.nextInt();
		
		if(mrk<25)
		{
			grd='F';
		}
		else if((mrk>=25)&&(mrk<45))
		{
			grd='E';
		}
		else if((mrk>=45)&&(mrk<50))
		{
			grd='D';
		}
		else if((mrk>=50)&&(mrk<60))
		{
			grd='C';
		}
		else if((mrk>=60)&&(mrk<80))
		{
			grd='B';
		}
		else if((mrk>=80)&&(mrk<=100))
		{
			grd='A';
		}
		else
		{
			System.out.println("ENTER THE CORRECT MARK SECURED:::");
		}
	System.out.println("THE GRADE ACCORDING TO THE MARKS IS="+grd);
	}
}