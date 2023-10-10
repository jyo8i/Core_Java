import java.util.*;
class EmpSalary
{
	public static void main(String MJ[])
	{
		double bs,da,hra,pf,lic,sa,gs,gd,ns;        //gs=Gross-salary,gd=Gross-deduction,ns=Net-salary
		
		Scanner bo=new Scanner(System.in);
		System.out.println("ENTER THE BASIC SALARY OF THE EMPLOYEE:::");
		bs=bo.nextInt();
		 if(bs>=20000)
		 {
			 da=bs*0.8;
			 hra=bs*0.3;
			 pf=bs*0.2;
			 lic=bs*0.1;
			 sa=5000;
		 }
		 else
		 {
			 da=bs*0.65;
			 hra=bs*0.25;
			 pf=bs*0.15;
			 lic=bs*0.05;
			 sa=2000;
		 }
		 
		 gs=bs+da+hra+sa;
		 gd=lic+pf;
		 ns=gs-gd;
		 
		 System.out.println("GROSS SALARY="+gs);
		 System.out.println("GROSS DEDUCTION="+gd);
		 System.out.println("NET SALARY="+ns);
	}
}
		