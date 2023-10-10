import java.util.*;
class ArrayAscendingOrder
{
	public static void main(String MN[])
	{
		int i,j,tmp;
		int ar[]=new int[10];
	  Scanner mj=new Scanner(System.in);
	  System.out.println("Enter 10 Numbers:");
	  
	  for(i=0;i<10;i++)
	  {
		  ar[i]=mj.nextInt();
	  }
	  
	  for(i=0;i<10;i++)
	  {
		  for(j=i+1;j<10;j++)
		  {
			  if(ar[i]>=ar[j])
			  {
				  tmp=ar[i];
				  ar[i]=ar[j];
				  ar[j]=tmp;
			  }
		  }
	  }
	  System.out.println("Array Elements In Ascending Order:");
	  for(i=0;i<10;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
	}
}