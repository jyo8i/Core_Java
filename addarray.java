import java.util.*;
public class addarray {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the array");
      Scanner r=new Scanner(System.in);
      int arr[]=new int[7]  ;
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=r.nextInt();
      }
      System.out.println("Array elements");
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]+" ");
         sum=sum+arr[i];
      }
      System.out.println(sum);
    }
}                                                  
