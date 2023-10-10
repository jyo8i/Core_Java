import java.util.*;
class VoteAge
{
	public static void main(String MJ[])
	{
		int ag;
		Scanner ob=new Scanner(System.in);
		System.out.print("ENTER THE AGE=");
		 
		 ag=ob.nextInt();
		 
		 if(ag>=18 && ag<=60)
		 {
			 System.out.println("--ELIGBLE FOR VOTING--");
		 }
		 else
		 {
			 System.out.println("--NOT ELIGBLE FOR VOTING--");
		 }
	}
}
