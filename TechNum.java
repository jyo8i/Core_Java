//JAVA PROGRAM TO CHECK TECH-NUMBER:::
import java.util.*;   //A TECH-NUMBER SO CALLED BEACUSE IT HAS EVEN NUMBER OF DIGITS
class TechNum                 //EXAMPLE:2025,3025
{
	public static void main(String MN[])
	{
		int i,num,dgt=0,sum=0,sq;
		int fh,sh;
		  Scanner mj=new Scanner(System.in);
		  
		  System.out.println("Enter Any Number:");
		  num=mj.nextInt();
		  
		  
		  for(i=num;i!=0;i=i/10)
		  {
			  dgt++;
		  }
		  if(dgt%2==0)
		  {
			  fh=num/100;
			  System.out.println("1st-Half Of The Number Is="+fh);
			  sh=num%100;
			  System.out.println("2nd-Half Of The Number Is="+sh);
		      sum=fh+sh;
		      System.out.println("Sum Of 1st and 2nd Half="+sum);
		   }
		     else
		       {
			     System.out.println("Entered Number is Having Odd Numbers of Digits");
			     System.out.println("So Number Is Not A Tech-Number");
		       }
		  sq=sum*sum;
		  System.out.println("Square Sum="+sq);
		  if(sq==num)
		  {
			  System.out.println(":::IT IS A TECH-NUMBER:::");
		  }
		  else
			  System.out.println(":::IT IS ! A TECH-NUMBER:::");
	}
}
