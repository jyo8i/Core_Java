class PrimeTen
{
	public static void main(String MN[])
	{
		int i,j,count,pn=0;
		System.out.println("Prime Numbers From 1 To 10");
		
		for(i=1;i<=10;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
     			  count++;
				}
			}
				if(count==2)
				{
				System.out.println(i);
				}
			
		}

	}
}