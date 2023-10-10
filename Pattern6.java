class Pattern6
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		
		for(i=65;i<=69;i++)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}
/*...OUTPUT:->

:PATTERN BELOW:
A
A B
A B C
A B C D
A B C D E

...*/