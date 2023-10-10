import java.util.*;       //JAVA PROGRAM TO FIND THE MULTPLICATION TABLE:::
class Mtable
{
	public static void main(String MJ[])
	{
		int i,n,m;
		Scanner mn=new Scanner(System.in);
		
		System.out.print("Enter Any Number To Find Its Table=");
		n=mn.nextInt();
	    
		System.out.println("MULTIPLICATION TABLE IS:");	
		for(i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(n+"*"+i+"="+m);
		}
	}
}