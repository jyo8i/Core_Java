import java.util.*;
public class primemethod {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       boolean ansprime=isprime(n);
       System.out.println(ansprime);
    }
    public static boolean isprime(int n)
    {
        int d=2;
        while(d<n)
        {
            if(n%d==0)
            {
                return false;
            }
            d++;
        }
        return true;
    }
}
