import java.util.*;
class ArrayOESeparate
{
	public static void main(String MN[])
	{
		int i,j,k;
		int ar[]=new int[10];
		int odd[]=new int[10];
		int even[]=new int[10];
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enters Numbers To The Array:");
		for(i=0;i<10;i++)
		{
			ar[i]=mj.nextInt();
		}
		k=j=0;
		for(i=0;i<10;i++)
		{
			if(ar[i]%2==0)
			{
				even[j]=ar[i];
				j++;
			}
			else
			{
				odd[k]=ar[i];
				k++;
			}
		}
		System.out.println("Array Of Even Numbers:");
		for(i=0;i<j;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("Array Of Odd Numbers:");
		for(i=0;i<k;i++)
		{
			System.out.print(odd[i]+" ");
		}
	}
}