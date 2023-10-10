import java.util.*;
class DigitFreq
{
	public static void main(String MN[])
	{
		int num,d;
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		num=mj.nextInt();
		
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		while(num!=0)
		{
			d=num%10;
			     switch(d)
			     {
		            	case 0:c0++;
		         	    break;
		            	case 1:c1++;
			            break;
			            case 2:c2++;
			            break;
			            case 3:c3++;
		             	break;
		            	case 4:c4++;
		            	break;
		            	case 5:c5++;
	             		break;
	             		case 6:c6++;
		            	break;
	            		case 7:c7++;
		            	break;
		             	case 8:c8++;
		            	break;
		            	case 9:c9++;
		            	break;
		            	default:;
		    	 }
			d=num/10;
		}
		System.out.println("Zero="+c0);
		System.out.println("One="+c1);
		System.out.println("Two="+c2);
		System.out.println("Three="+c3);
		System.out.println("Four="+c4);
		System.out.println("Five="+c5);
		System.out.println("Six="+c6);
		System.out.println("Seven="+c7);
		System.out.println("Eigtht="+c8);
		System.out.println("Nine="+c9);
	}
}