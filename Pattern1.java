class Pattern1
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*OUTPUT:->
:PATTERN BELOW:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/