class Pattern2
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
/*OUTPUT:->
:PATTERN BELOW:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
