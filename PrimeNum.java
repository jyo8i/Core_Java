import java.util.*;       //JAVA PROGRAM TO CHECK PRIME NUMBER
class PrimeNum
{
	public static void main(String MJ[])
	{
		int i,n,count;
		Scanner nm=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		n=nm.nextInt();
		
		count=0;
		System.out.println("Facotrs Are:");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			    System.out.println(" "+i);
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not A Prime Number");
		}
	}
}
