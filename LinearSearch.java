import java.util.*;
class LinearSearch
{
	public static void main(String MN[])
	{
		int ar[]=new int[10];
		int i,pos,num;
		boolean flag=false;
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter 10 Number to the Array:");
		
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		System.out.print("Enter To Be Searched:");
		num=mj.nextInt();
		
		pos=0;
		for(i=0;i<10;i++)
		{
			if(ar[i]==num)
			{
				flag=true;
				pos=i+1;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Number is found at:"+pos+" Position");
		}
		else
		{
			System.out.println("Sorry! Number Not found");
		}
	}
}