//JAVA PROGRAM TO FIND OUT THE BIGGEST DIGIT OF A NUMBER:::
import java.util.*;
class BigDigit
{
	public static void main(String Mj[])
	{
		int i,n,d,big;
		Scanner mn=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		n=mn.nextInt();
		
		big=0;
		for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			if(d>big)
			{
				big=d;
			}
		}
		System.out.println("Biggest Digit Of The Number Is="+big);
	}
}