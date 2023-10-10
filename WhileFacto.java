import java.util.*;
class WhileFacto
{
	public static void main(String MN[])
	{
		long num,fact=1;
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Any Number:");
       
       num=mj.nextInt();
       while(num!=0)
	   {
		   fact=fact*num;
		   num--;
	   }
	   System.out.println("Factorial Of The Number Is="+fact);
	}
}
	   