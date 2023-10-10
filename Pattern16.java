class Pattern16
{
	public static void main(String MN[])
	{
		int i,j,k,l;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(l=i-1;l>=1;l--)
			{
				System.out.print("* ");
			}
	     	System.out.println();
		}
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i==1||i==9||j==1||j==9)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
            System.out.println();        
		}
	}
}
/*...OUTPUT:->

:PATTERN BELOW:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
*               *
*               *
*               *
*               *
*               *
*               *
*               *
* * * * * * * * *

....*/