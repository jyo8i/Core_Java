import java.util.*;
class Exam
{
	public static void main(String MJ[])
	{
		char co=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 'Y' for Medical issue. If Not Then Enter 'N'");
		 
		 co=ob.next().charAt(0);
		 
		 if((co=='y') || (co=='Y'))
		 {
			 System.out.println("ELIGIBLE FOR EXAM");
		 }
		 else
		 {
			 System.out.println("NOT ELIGIBLE FOR EXAM");
		 }
	}
}
