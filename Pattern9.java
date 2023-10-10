import java.util.*;           //PATTERN CODE TO PRINT THE PYRAMID OF NUMBER:::
class Pattern9
{
	public static void main(String MN[])
	{
		int i,j,k,cnt;
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter The Value Of 'cnt':::");
		cnt=mj.nextInt();
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=cnt;i++)
		{
			for(j=cnt-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			     	for(k=1;k<=i;k++)
				  {
				     System.out.print(k+" ");
				  }
		       System.out.println();
	    }
	}
}
/*...OUTPUT:->

Enter The Value Of 'cnt':::
6
:PATTERN BELOW:
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
1 2 3 4 5 6

...*/