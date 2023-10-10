class HomePattern
{
	public static void main(String MN[])
	{
		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=2*i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int a=1;a<=7;a++)
		{
			for(int b=1;b<=7;b++)
			{
				if(a==1||a==7||b==1||b==7)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}