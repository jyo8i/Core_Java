import java.util.*;             //JAVA PROGRAM TO SUM THE DIGITS OF A NUMBER
class DigitSum
{
	public static void main(String MJ[])
	{                                       // 'i' is used for the loop , 'sum' is summation
		int i,n,d,sum;              // 'd' used for digt , 'n' is for Input 
		Scanner lo=new Scanner(System.in);       //here 'lo' is used as the object of Scanner class
		
		System.out.println("Enter Any Number:");
		n=lo.nextInt();                        //'lo' object is used for non-static method(nextInt())
		
		sum=0;
		for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			sum=sum+d;
		}
		System.out.println("Sum Of Digits="+sum);
	}
}
		
		
		