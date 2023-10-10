class Pattern3
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
/*OUTPUR:->

:PATTERN BELOW:
*
* *
* * *
* * * *
* * * * *

....*/