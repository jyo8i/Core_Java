import java.util.*;
public class ArrayInsert {
    public static void main(String[] args) {
        int size,i,pos,item;
        System.out.println("Enter array size:   ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the array element:  ");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter array position:  ");
        pos=sc.nextInt();
        System.out.print("Enter the array item:   ");
        item=sc.nextInt();
        for(i=size;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=item;
        size++;
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]+"  ");
        }

    }
}
