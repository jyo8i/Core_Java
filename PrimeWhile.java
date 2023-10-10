class PrimeWhile
{
	public static void main(String MN[])
	{
		int i,j,pn,count;
		System.out.println("Prime Numbers From 1 to 10");
		
		i=2;
		while(i<=10)
		{
			count=0;
			j=1;
			while(j<=i)
			{
				if(i%j==0)
				{
				   count++;
				}
			  j++;
			}
			if(count==2)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}