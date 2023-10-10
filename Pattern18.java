class Pattern18
{
	public static void main(String MN[])
	{
		int i,j,k;
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
			System.out.println();
		}
	}
}
/*...OUTPUT:->
   
   :PATTERN BELOW:
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
		
.....*/