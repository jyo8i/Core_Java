class Pattern5
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
	}
}
/*....OUTPUT:->
:PATTERN BELOW:
#
* *
# # #
* * * *
# # # # #

....*/