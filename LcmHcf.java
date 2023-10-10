import java.util.*;
class LcmHcf
{
	public static void main(String MN[])
	{
		int n1,n2,sml,hcf,lcm,i;
		
		Scanner mj=new Scanner(System.in);
		System.out.println(" Enter Any Two Digit:");
		
		n1=mj.nextInt();
		n2=mj.nextInt();
		
		if(n1<n2)
		{
			sml=n1;
		}
		else
		{
			sml=n2;
		}
		for(i=sml;i>=1;i--)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
				break;	
		    }		
		}
		hcf=i;
		lcm=(n1*n2)/hcf;
		System.out.println("HCF OF TWO NUMBER IS="+hcf);
		   System.out.println("LCM OF TWO NUMBER IS="+lcm);
		
	}
}