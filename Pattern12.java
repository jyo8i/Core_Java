class Pattern12
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
	
	    for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(j+" ");
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
/*    PATTERN STRUCTURE:
      1 2 3 4 5
	  1       5
	  1       5
	  1       5
	  1 2 3 4 5 
*/