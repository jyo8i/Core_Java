class PrimeGoo
{
	public static void main(String MN[])
	{
		int i,j,count;
		
		for(i=2;i<=10;i++)
		{
			count=0;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count+=1;
					break;
				}
			}
			if(count==0 && i!=1)
			{
				System.out.println(i);
			}
		}
	}
}