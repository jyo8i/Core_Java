import java.util.*;
public class summatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter 1st array element: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               a[i][j]=r.nextInt();
            }
        }
        System.out.println("Enter the 2nd Array element: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
              b[i][j]=r.nextInt();
            }
        }
        System.out.print("1st matrix\n");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
 System.out.print("2nd matrix\n");
    for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("sum of matrix\n");
         for(int i=0;i<2;i++)
         {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
             System.out.print("\n");
         }
    }
}
