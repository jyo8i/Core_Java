import java.util.*;
class BigFive{
	public static void main(String ar[])
	{
		int a,b,c,d,e,big;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("ENTER ANY FIVE NUMBER:::");
		a=ob.nextInt();
		b=ob.nextInt();
		c=ob.nextInt();
		d=ob.nextInt();
		e=ob.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						big=a;
					}
					else
					{
						big=e;
					}
				}
					else
					{
						if(d>e)
						{
							big=d;
						}
						else
						{
							big=e;
						}
					}
				}
				else
				{
					if(c>d)
					{
						if(c>e)
						{
							big=c;
						}
						else
						{
							big=e;
						}
					}
					else
					{
						if(d>e)
						{
							big=d;
						}
						else
						{
							big=e;
						}
					}
				}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						big=b;
					}
					else
					{
						big=e;
					}
				}
				else
				{
					if(d>e)
					{
						big=d;
					}
					else
					{
						big=e;
					}
				}
			}
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						big=c;
					}
					else
					{
						big=e;
					}
				}
				else
				{
					if(d>e)
					{
						big=d;
					}
					else
					{
						big=e;
					}
				}
			}
     	}
	System.out.println("BIGGEST NUMBER IS="+big);
	}
}
						
				
			
					
						