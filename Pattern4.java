class Pattern4
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		for(i=1;i<=6;i++)
		{
			for(j=1;j<i;j++)
			{
				if(j%2==0)
				{
					System.out.print("#"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
/*...OUTPUT:->

:PATTERN BELOW:

*
* #
* # *
* # * #
* # * # *

....*/