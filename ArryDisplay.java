import java.util.*;
class ArryDisplay
{
	public static void main(String MN[])
	{
		int i;
		int ar[]=new int[10];
		Scanner mj=new Scanner(System.in);
		
		System.out.println("Enter The Numbers to The Array:");
		
		for(i=0;i<10;i++)
		{
		   ar[i]=mj.nextInt();
		}
		
		System.out.println("Array Elements Are:");
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}