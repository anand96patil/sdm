package Arrays;
import java.util.*;
public class arr3 {
    public static void readarr(int[] tarr)
    {
        Scanner scn=new Scanner(System.in);
        for(int i=0; i<tarr.length; ++i)
        {
            System.out.printf("\n arr[%d]=", i);
            tarr[i]=scn.nextInt();
        }
    }

    public static void showarr(int[] tarr)
    {
        for(int i=0; i<tarr.length; ++i)
        {
            System.out.printf("\n arr[%d]= %d", i, tarr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sz;
        int[] arr;

        System.out.println("\n Enter the size of the array to create :");
        sz=scn.nextInt();
        arr=new int[sz];

        readarr(arr);

        showarr(arr);
    }
}
