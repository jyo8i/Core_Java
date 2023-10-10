class pattern14
{
	public static void main(String MN[])
	{
		int i,j;
		System.out.println(":PATTERN BELOW:");
		 
		 for(i=1;i<=5;i++)
		 {
			 for(j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 for(i=1;i<=4;i++)
		 {
			 for(j=1;j<=5-i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	}
}	
/*  OUTPUT:->
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
*/