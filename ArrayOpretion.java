import java.util.Arrays;

/**
 * Created by LENOVO ALMAZEN on 17/01/2022.
 */
public class ArrayOpretion {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        System.out.println(Arrays.toString(x));
     System.out.println("after revers");
     System.out.println(Arrays.toString(reverse(x)));
      //  System.out.println("after shift right");
      //  System.out.println(Arrays.toString(shiftRight(x)));
    }

    public static  int[] shiftLeft(int[] b)
    {
        int t= b[0];
        for (int i = 0; i <b.length-1 ; i++) {
            b[i]=b[i+1];
        }
        b[b.length-1]=t;
        return b;}
    public static  int[] reverse(int[]a)
    {
        int n= a.length-1;
        for (int i = 0; i <a.length-1 ; i++) {
            int t= a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
        return a;
    }
    public static  int[] shiftRight(int[] b)
    {
        int t= b[b.length-1];
        for (int i = b.length-1; i>0 ; i--) {
            b[i]=b[i-1];
        }
        b[0]=t;
        return b;}
}

