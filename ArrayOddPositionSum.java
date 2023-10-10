//JAVA PROGRAM TO
import java.util.*;
class ArrayOddPositionSum
{
	public static void main(String MN[])
	{
		int i,osum;
		int ar[]=new int[10];
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Any 10 Numbers Into Array:");
		  for(i=0;i<10;i++)
		  {
			  ar[i]=mj.nextInt();
		  }
		  osum=0;
		  for(i=0;i<10;i++)
		  {
			  if(i%2!=0)
			  {
				 osum=osum+ar[i];
			  }
		  }
            System.out.println("Sum Of All Odd Positioned Number is="+osum);
	}
}		