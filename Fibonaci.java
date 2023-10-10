//JAVA PROGRAM TO DISPLAY THE FIBONACI SERIES UPTO nth TERMS
import java.util.*; 
class Fibonaci
{
	public static void main(String MJ[])
	{
		int i,n1,n2,n3,cnt;               //cnt=count(nth-terms)
		Scanner mn=new Scanner(System.in);
		
		System.out.print("Enter Terms Number=");
		cnt=mn.nextInt();
		
		System.out.print("Fibonaci Series Is:->");
		n1=0;n2=1;
		for(i=0;i<=cnt;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n1);
		    n1=n2;
			n2=n3;
		}
	}
}
		