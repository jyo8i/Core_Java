class Pattern11          //JAVA PROGRAM TO PRINT DIGONAL ELEMENT
{
	public static void main(String MN[])
	{
		int i,j;
		
		System.out.println(":PATTERN BELOW:");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if((j+i==6) || (i==j))
				{
					System.out.print(i+" ");
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
1       1
  2   2
    3
  4   4
5       5

...*/