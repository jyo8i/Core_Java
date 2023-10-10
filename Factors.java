import java.util.*;      //JAVA PROGRAM TO FIND THE FACTORS OF A NUMBER
class Factors
{
	public static void main(String MJ[])
	{
		int i,n;
		Scanner fn=new Scanner(System.in);
		
		System.out.println("Enter Any Number Find The Factors:");
		n=fn.nextInt();
		
		System.out.println("Factors Of The Number Are:::");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			   System.out.print(" "+i);
			}
	
		}
	}
}