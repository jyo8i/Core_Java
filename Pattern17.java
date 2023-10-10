class Pattern17
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
			  System.out.print(k+" ");
			}
			for(l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
/*...OUTPUT:->

:PATTERN BELOW:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1

...*/