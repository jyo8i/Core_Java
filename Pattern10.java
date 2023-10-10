              //RIGHT-ANGLE TRIANGLE(90-DEG ON RIGHT-SIDE)
class Pattern10
{
	public static void main(String MN[])
	{
		int i,j,k;
		
		System.out.println(":PATTERN BELOW:");
		for(i=1;i<=6;i++)
		{
			 for(j=5;j>=i;j--)
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
1 2 3 4 5 6

...*/