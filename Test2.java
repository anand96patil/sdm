package Arrays;
import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sz;
        int[] arr;

        System.out.println("\n Enter the size of the array to create :");
        sz=scn.nextInt();
        arr=new int[sz];

        //Initialize the array
        for(int i=0; i<arr.length; ++i)
        {
            System.out.printf("\n arr[%d]=", i);
            arr[i]=scn.nextInt();
        }

        //display the array
        for(int i=0; i<arr.length; ++i)
        {
            System.out.printf("\n arr[%d]= %d", i, arr[i]);
        }
    }
}
