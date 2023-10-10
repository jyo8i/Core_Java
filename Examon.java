/*import java.util.*;                           Dought!!!!!!!
class Examon
{
	public static void main(String MJ[])
	{
		char m=0;
		double nch,nca;             //nch=Number Of Classes Held   , nca=Number Of Classes Attended
		double ap;               //ap=Attendence percentage
		
		Scanner ob=new Scanner(System.in);
		System.out.println("IF CASE OF MEDICAL ISSUE PLEASE ENTER YES FOR 'y' AND NO FOR 'N'");
		m=ob.next().charAt(0);
		
		System.out.println("ENTER NUMBER OF CLASSES HELD:");
		nch=ob.nextDouble();
		
		System.out.println("ENTER NUMBER OF CLASSES ATTENDED:");
		nca=ob.nextDouble();
		
		ap=nca/nch*100;
		//System.out.println("Enter Yes as 'Y' for Having Any Medical Issue If Not Then Enter NO as 'N'");
		//m=ob.next().charAt(0);
		if((m=='y') || (m=='Y'))
		{
			System.out.println("ELIGBLE FOR THE EXAMINATION FOR HAVING MEDICAL ISSUE");
		}
		else
		{
		  if(ap>((75/nch)*100))
		    {
			  System.out.println("ALLOWED FOR EXAM"+" "+"AND ATTENDENCE PERCENTAGE="+ap+"%");
		    }
		     else
		    {
			  System.out.println("NOT ALLOWED FOR EXAM"+" "+"AND ATTENDENCE PERCENTAGE="+ap+"%"); 
		    }
		}
	}
}   */