import java.util.*;
public class avgmethod {
    public static void main(String[] args) {
      int m1,m2;
      System.out.println("Enter the value"); 
      Scanner r=new Scanner(System.in);
      m1=r.nextInt();
      m2=r.nextInt();
    Average(m1,m2) ;
   
    }
    public static  double Average(int m1,int m2)
    {
        int totalmark=m1+m2;
        double avg=totalmark/2;
         System.out.println(avg);
         return avg;
    }
}
