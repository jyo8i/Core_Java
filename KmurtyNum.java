//JAVA PROGRAM TO CHECK KRISHNAMURTY NUMBER:::
import java.util.*;  
class KmurtyNum
{
	public static void main(String MN[])
	{
		int i,j,d,num,sum=0,fact;
		Scanner mj=new Scanner(System.in);
		
		System.out.print("Enter Any Number=");
		num=mj.nextInt();
		
		for(i=num;i!=0;i=i/10)
		{
			d=i%10;
			fact=1;
			for(j=d;j>=1;j--)
			{
				fact=fact*j;
			}
		     sum=sum+fact;
		}
		  if(sum==num)
		  {
		     System.out.println("KrishnaMurty Number");
		  }
		   else 
		   {
			  System.out.println("Not KrishnaMurty Number");
		    }
		
	}
}