package Arrays;

public class arr1 {
    public static void main(String[] args) {
        //create and initialize 1-D array
        //arrays are references in java
        int[] ar1={1,2,3,4,5};
        int[] ar2=null;
        int[] ar3=new int[]{10,20,30,40,50};
        int[] ar4=new int[5];
        ar4[0]=100;
        ar4[1]=200;
        ar4[2]=300;
        ar4[3]=400;
        ar4[4]=500;

        System.out.println("\n size of ar1 : " + ar1.length);
        //System.out.println("\n size of ar2 : " + ar2.length);
        System.out.println("\n size of ar3 : " + ar3.length);
        System.out.println("\n size of ar4 : " + ar4.length);

        System.out.println("\n array 1\n");
        for(int i=0; i<ar1.length; ++i)
            System.out.printf("%5d", ar1[i]);

        System.out.println("\n array 3\n");
        for(int i=0; i<ar3.length; ++i)
            System.out.printf("%5d", ar3[i]);

        System.out.println("\n array 4\n");
        for(int i=0; i<ar4.length; ++i)
            System.out.printf("%5d", ar4[i]);

        ar2=ar4;
        System.out.println("\n array 2\n");
        for(int i=0; i<ar2.length; ++i)
            System.out.printf("%5d", ar2[i]);

        ar2[3]=1000;
        System.out.println("\n array 4\n");
        for(int i=0; i<ar4.length; ++i)
            System.out.printf("%5d", ar4[i]);

        ar2=ar4;
        System.out.println("\n array 2\n");
        for(int i=0; i<ar2.length; ++i)
            System.out.printf("%5d", ar2[i]);

        System.out.println("\n hashcode of ar1 : " + ar1.hashCode());
        System.out.println("\n hashcode of ar2 : " + ar2.hashCode());
        System.out.println("\n hashcode of ar3 : " + ar3.hashCode());
        System.out.println("\n hashcode of ar4 : " + ar4.hashCode());
    }
}
