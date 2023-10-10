import java.util.*;
class BinarySearch
{
	public static void main(String MN[])
	{
		int ar[]=new int[10];
		int i,lb,ub,mid,pos,item;
		boolean flag=false;
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Any 10 Number:");
		
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		System.out.println("Enter Number To Be Searched:");
		item=mj.nextInt();
		
		lb=0;
		ub=9;
		pos=0;
		mid=(lb+ub)/2;
		
		while(lb<=ub)
		{
			if(ar[mid]==item)
			{
				flag=true;
				pos=mid+1;
				break;
			}
			else if(item>ar[mid])
			{
				lb=mid+1;
			}
			else 
			{
				ub=mid-1;
			}
			mid=(lb+ub)/2;
		}
		if(flag==true)
		{
			System.out.println("Number is found at:"+pos+" position");
		}
		else
		{
			System.out.println("Sorry! Number Not Found.");
		}
	}
}