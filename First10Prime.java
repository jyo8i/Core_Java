class First10Prime
{
	public static void main(String MN[])
	{
		int i,j,cnt,n;
		//cnt=0;
		n=0;
		
		while(n<10)
		{
			j=1;
			cnt=0;
			  i=2;
			  while(j<=i)
			  {
				  if(i%j==0)
				  {
					  cnt++;
					  j++;
				  }
			  
				  if(cnt==2)
				  {
					  System.out.println(i);
					  n++;
				  }
				  i++;
			  }
		}
	}
}