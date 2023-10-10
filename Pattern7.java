class Pattern7
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*...OUTPUT:->

:PATTERN BELOW:
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

...*/