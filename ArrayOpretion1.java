import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 17/01/2022.
 */
public class ArrayOpretion1 {
    int x[];
    int numOfElements;
    public static void main(String[] args) {
        ArrayOpretion1 test= new ArrayOpretion1();
        Scanner in = new Scanner(System.in);
        System.out.println("input the elements");
        for (int i = 0; i <7 ; i++) {
            if (test.addSorted(in.nextInt())==0)
                System.out.println("added sucessfuly");
            else
                System.out.println("Arry is full");
            System.out.println(Arrays.toString(test.x));
        }
        System.out.println("input index for delete");
        for (int i = 0; i <7 ; i++) {
            if (test.deleteSorted(in.nextInt())==0)
                System.out.println("deleted sucessfuly");
            else
                System.out.println("arry is emp");
            System.out.println(Arrays.toString(test.x));
        }
    }
    public ArrayOpretion1() {
        x=new int[5];
        numOfElements=0;
    }

    public int deleteSorted( int index   )
    {
        if(numOfElements>0&& index>=0)
        {
            int i= index;
            while (i<numOfElements-1 )
            {
                x[i]=x[i+1];
                i++;
            }
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }
    public int delete(    )
    {
        if(numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }
    public int add(int e)
    {
        if (numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public int addSorted(int e)
    {
        if (numOfElements<x.length)
        {

            int i=numOfElements;
            while(i>0&&e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

}
