import java.util.*;
class ArrayNumSearch
{
	public static void main(String MN[])
	{
		int i,num;
		int ar[]=new int[10];
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter 10 Numbers To The Array:");
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		System.out.println("Enter The Number To Be Searched:");
		num=mj.nextInt();
		for(i=0;i<10;i++)
		{
			if(num==ar[i])
			{
				System.out.println("Number is found at "+(i+1)+" "+" Index");
				System.out.println("The Number is="+ar[i]);
			break;
			}
		}
	}
}